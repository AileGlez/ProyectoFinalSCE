/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsarticulo;

import entidades.Articulo;
import frontera.ArticuloFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author susy
 */
@WebService(serviceName = "WsArticulo")
public class WsArticulo {

    @EJB
    private ArticuloFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "entity") Articulo entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") Articulo entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") Articulo entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Articulo find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Articulo> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Articulo> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findByIsbn")
    public int findByIsbn(@WebParam(name = "isbn") String isbn) {
        return ejbRef.findByIsbn(isbn);
    }
    
    //FINDBYNOMBRE
    @WebMethod(operationName = "findByNombre")
    public List<Articulo> findByNombre(@WebParam(name = "nom") String nom) {
        return ejbRef.findByNombre(nom);
    }
    
}
