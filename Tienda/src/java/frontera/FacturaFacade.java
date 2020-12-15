/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontera;

import entidades.Articulo;
import entidades.Cliente;
import entidades.Factura;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author tabat
 */
@Stateless
public class FacturaFacade extends AbstractFacade<Factura> {

    @PersistenceContext(unitName = "TiendaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FacturaFacade() {
        super(Factura.class);
    }
    
    public java.util.List<Factura> findByIdfactura(int id)
    {
        em = getEntityManager();
        TypedQuery<Factura> queryFacById = em.createNamedQuery("Factura.findByIdfactura", Factura.class);
        queryFacById.setParameter("idfactura", id);
        java.util.List<Factura> lista= queryFacById.getResultList();

        return lista;
    }
    
    public java.util.List<Cliente> findByIdcliente(int id)
    {
        em = getEntityManager();
        TypedQuery<Cliente> queryClienteById = em.createNamedQuery("Cliente.findByIdcliente", Cliente.class);
        queryClienteById.setParameter("idcliente", id);
        java.util.List<Cliente> lista= queryClienteById.getResultList();

        return lista;
    }
    
    public java.util.List<Articulo> findByISBN(String id)
    {
        em = getEntityManager();
        TypedQuery<Articulo> queryArtByIsbn= em.createNamedQuery("Articulo.findByIsbn", Articulo.class);
        queryArtByIsbn.setParameter("isbn", id);
        java.util.List<Articulo> lista= queryArtByIsbn.getResultList();

        return lista;
    }
}
