/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wspago;

import entidades.Articulo;
import entidades.Cliente;
import entidades.Empresa;
import entidades.Factura;
import entidades.Mediopago;
import frontera.FacturaFacade;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Victor
 */
@WebService(serviceName = "WsPago")
public class WsPago {

    @EJB
    private FacturaFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "entity") Factura entity) {
        ejbRef.create(entity);
    }
    /*
    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") Factura entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") Factura entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Factura find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }*/

    @WebMethod(operationName = "findAll")
    public List<Factura> findAll() {
        return ejbRef.findAll();
    }
    /*
    @WebMethod(operationName = "findRange")
    public List<Factura> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }*/
    
        //FINDBYIDFAC
    @WebMethod(operationName = "findByIdfactura")
    public List<Factura> findByIdfactura(@WebParam(name = "id") int id) {
        return ejbRef.findByIdfactura(id);
    }
    
    //FINDBYIDCLENTE
    @WebMethod(operationName = "findByIdcliente")
    public List<Cliente> findByIdcliente(@WebParam(name = "id") int id) {
        return ejbRef.findByIdcliente(id);
    }
    
    //FINDBYISBN
    @WebMethod(operationName = "findByISBN")
    public List<Articulo> findByISBN(@WebParam(name = "id") String id) {
        return ejbRef.findByISBN(id);
    }
    
    //HAY FONDOS: recibe factura/ regresa si hay fondos 
    /**
     * Web service operation
     */
    @WebMethod(operationName = "hayFondos")
    public boolean hayFondos(@WebParam(name = "facturaId") int facturaId) {
        //TODO write your implementation code here:
        List<Factura> listaF= findByIdfactura(facturaId);
        boolean hayF=true;
        for(Factura f:listaF)
        {
            if(f.getTotalapagar().compareTo(f.getMediopagoId().getFondos())>0)
                hayF=false;
        }
        return hayF;
    }
    
    //CREA PEDIDO: recibe id cliente, isbn, cantidad/ regresa factura
    /**
     * Web service operation
     */
    @WebMethod(operationName = "nuevoPedido")
    public int nuevoPedido(@WebParam(name = "idCliente") int idCliente, @WebParam(name = "ISBN") String isbn, @WebParam(name = "cant") int cant) {
        //TODO write your implementation code here:
        java.util.List<Cliente> listaC= findByIdcliente(idCliente);
        Cliente cp= new Cliente();
        for(Cliente c:listaC)
        {
            Mediopago mp= new Mediopago();
            mp.setIdmedpago(c.getMediopagoId().getIdmedpago());
            mp.setFondos(c.getMediopagoId().getFondos());
            cp.setIdcliente(c.getIdcliente());
            cp.setMediopagoId(mp);
            cp.setNombre(c.getNombre());
            cp.setAppat(c.getAppat());
            cp.setApmat(c.getApmat());
            cp.setEmail(c.getEmail());
            cp.setTelefono(c.getTelefono());
            cp.setDireccion(c.getDireccion());
            cp.setCp(c.getCp());
        }
        java.util.List<Articulo> listaA=findByISBN(isbn);
        Articulo ap= new Articulo();
        for(Articulo a:listaA)
        {
            Empresa ep= new Empresa();
            ep.setIdempresa(a.getEmpresaId().getIdempresa());
            ep.setNombre(a.getEmpresaId().getNombre());
            ap.setIsbn(a.getIsbn());
            ap.setEmpresaId(ep);
            ap.setNombre(a.getNombre());
            ap.setPrecio(a.getPrecio());
            ap.setStock(a.getStock());
            System.out.println("El precio del articulo es: "+ap.getPrecio());
        }
        Factura fn= new Factura();
        fn.setClienteId(cp);
        fn.setArticuloIsbn(ap);
        fn.setMediopagoId(cp.getMediopagoId());
        fn.setCantidad(cant);
        BigDecimal tot=BigDecimal.valueOf(cant).multiply(ap.getPrecio());
        fn.setTotalapagar(tot);
        create(fn);
        return fn.getIdfactura();
    }
    
}
