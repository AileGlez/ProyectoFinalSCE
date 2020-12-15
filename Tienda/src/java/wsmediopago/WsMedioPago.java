/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsmediopago;

import entidades.Mediopago;
import frontera.MediopagoFacade;
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
@WebService(serviceName = "WsMedioPago")
public class WsMedioPago {

    @EJB
    private MediopagoFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "entity") Mediopago entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") Mediopago entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") Mediopago entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Mediopago find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Mediopago> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Mediopago> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
     //DECREMENTA FONDOS: recibe idMedioPago, monto y un booleano que en TRUE decrementa y en FALSE aumenta/ regresa nuevos fondos 
    /**
     * Web service operation
     */
    @WebMethod(operationName = "updateFondosMedPag")
    public BigDecimal updateFondosMedPag(@WebParam(name = "idMedioPago") int idMedioPago,@WebParam(name = "monto") BigDecimal monto,@WebParam(name = "decrementa") boolean decrementa) {//el parámetro "decrementa" en TRUE decrementa y en FALSE aumenta
        //TODO write your implementation code here:
        BigDecimal fondos = null;
        Mediopago entity = find(idMedioPago);
        if(decrementa)
            entity.setFondos(entity.getFondos().subtract(monto));
        else
            entity.setFondos(entity.getFondos().add(monto));
        fondos=entity.getFondos();
        ejbRef.edit(entity);
        return fondos;
    }
    
}
