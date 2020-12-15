/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsenvios;

import entidades.Empresa;
import entidades.Envio;
import entidades.Factura;
import frontera.EnvioFacade;
import java.text.ParseException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author avion
 */
@WebService(serviceName = "WsEnvios")
public class WsEnvios {

    @EJB
    private EnvioFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    //@Oneway
    public int create(@WebParam(name = "entity") Envio entity) {
        ejbRef.create(entity);
        int idEnvio = entity.getIdenvio();
        return idEnvio;
    }
    
    /*
    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") Envio entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") Envio entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Envio find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }*/

    @WebMethod(operationName = "findAll")
    public List<Envio> findAll() {
        return ejbRef.findAll();
    }
    /*
    @WebMethod(operationName = "findRange")
    public List<Envio> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }*/
    
    
    // Encontrar por fecha de entrega (saber si ya se entregó o no)
    @WebMethod(operationName = "findByFechaEntrega")
    public List<Envio> fechaEntrega(@WebParam(name = "deliveryDate") Date deliveryDate) throws ParseException {
        return ejbRef.findByFechaEntrega(deliveryDate);
    }
    
    //FINDBYIDFAC
    @WebMethod(operationName = "findByIdfactura")
    public List<Factura> findByIdfactura(@WebParam(name = "id") int id) {
        return ejbRef.findByIdfactura(id);
    }
        
    @WebMethod(operationName = "nuevoEnvio")
    //public int nuevoEnvio(@WebParam(name = "idFactura") int idFactura) {
    public int nuevoEnvio(@WebParam(name = "idFactura") int idFactura) {
        //public int nuevoEnvio(@WebParam(name = "idFactura") int idFactura, @WebParam(name = "idEmpresa") int idEmpresa) {
        //TODO write your implementation code here:
        
        Random rnd = new Random();
        
        GregorianCalendar gc = new GregorianCalendar();
        int low = 0;
        int high = 2;
        int month = rnd.nextInt(high-low) + low;
        low = 1;
        high = 29; 
        int day = rnd.nextInt(high-low)+low;
        gc.set (2021, month, day); // Y/M-1/D (es decir, mes 0 es enero)       
        XMLGregorianCalendar fechaAprox = null;
        try {
            fechaAprox = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(WsEnvios.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        java.util.List<Factura> listaF=findByIdfactura(idFactura);
        Factura f= new Factura();
        for(Factura fp:listaF)
        {
            f.setIdfactura(fp.getIdfactura());
            f.setClienteId(fp.getClienteId());
            f.setArticuloIsbn(fp.getArticuloIsbn());
            f.setMediopagoId(fp.getMediopagoId());
            f.setCantidad(fp.getCantidad());
            f.setTotalapagar(fp.getTotalapagar());
        }
        Empresa empresa = f.getArticuloIsbn().getEmpresaId();
        
        Envio envio = new Envio();
        
        envio.setFechaentrega(fechaAprox.toGregorianCalendar().getTime());
        envio.setFacturaId(f);
        envio.setEmpresaId(empresa);       
        create(envio);
        return envio.getIdenvio();
    }


}
