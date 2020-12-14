/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontera;

import entidades.Articulo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author tabat
 */
@Stateless
public class ArticuloFacade extends AbstractFacade<Articulo> {

    @PersistenceContext(unitName = "TiendaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ArticuloFacade() {
        super(Articulo.class);
    }
    
    public int findByIsbn(String isbn)
    {
        em = getEntityManager();
        TypedQuery<Articulo> queryByName = em.createNamedQuery("Articulo.findByIsbn", Articulo.class);
        queryByName.setParameter("isbn", isbn);
        int valor = queryByName.getSingleResult().getStock();
        return valor;
    }
    
     public int updateStock(String isbn, int stock) 
    {
        //String sStock =  Integer.toString(stock); 
        em = getEntityManager();
        int query = em.createNativeQuery("UPDATE ARTICULO SET stock = ? WHERE isbn = ?")
                .setParameter(1, stock).setParameter(2, isbn).executeUpdate();
        return query; 
    }
     
   
}
