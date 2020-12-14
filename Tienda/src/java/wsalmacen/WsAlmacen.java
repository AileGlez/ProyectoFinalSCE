/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsalmacen;

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
 * @author tabat
 */
@WebService(serviceName = "WsAlmacen")
public class WsAlmacen {

    @EJB
    private ArticuloFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    
    public String create(@WebParam(name = "entity") Articulo entity) {
        ejbRef.create(entity);
        String idArticulo = entity.getIsbn(); 
        return idArticulo;
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

    //Encuentra por ISBN 
    @WebMethod(operationName = "find")
    public Articulo find(@WebParam(name = "id") String id) {
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
    
    // Por el isb encuentra el stock y lo regresa. 
    @WebMethod(operationName = "findByIsbn")
    public int findByIsbn(@WebParam(name = "isbn") String isbn) {
        return ejbRef.findByIsbn(isbn);
    }
   
    //Metodo que actualiza el stock  
     @WebMethod(operationName = "updateStock")
    public int updateStock(@WebParam(name = "ISBN")
    String ISBN, @WebParam(name = "unidades")int unidades)  {
        int stock = findByIsbn(ISBN);
        stock = stock - unidades; 
        return ejbRef.updateStock(ISBN,stock);
        
    }
    
    //metodo que comprueba si hay stock 
    @WebMethod(operationName = "comprobarStock")
    public Boolean comprobarStock(@WebParam(name = "ISBN")
    String ISBN, @WebParam(name = "unidades")int unidades) {
        boolean respuesta = false;
        int stock = findByIsbn(ISBN);
        if (stock >= unidades ){
            respuesta = true; 
        }
        return respuesta;
    }   
    
  
}
