/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsenvios;

import entidades.Envio;
import frontera.EnvioFacade;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

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
    }

    @WebMethod(operationName = "findAll")
    public List<Envio> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Envio> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
    
    // Encontrar por fecha de entrega (saber si ya se entregó o no)
    @WebMethod(operationName = "findByFechaEntrega")
    public List<Envio> fechaEntrega(@WebParam(name = "deliveryDate") Date deliveryDate) throws ParseException {
        return ejbRef.findByFechaEntrega(deliveryDate);
    }


}
