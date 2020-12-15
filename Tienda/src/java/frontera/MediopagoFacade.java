/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontera;

import entidades.Factura;
import entidades.Mediopago;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author tabat
 */
@Stateless
public class MediopagoFacade extends AbstractFacade<Mediopago> {

    @PersistenceContext(unitName = "TiendaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MediopagoFacade() {
        super(Mediopago.class);
    }
    
    public java.util.List<Factura> findByIdfactura(int id)
    {
        em = getEntityManager();
        TypedQuery<Factura> queryFacById = em.createNamedQuery("Factura.findByIdfactura", Factura.class);
        queryFacById.setParameter("idfactura", id);
        java.util.List<Factura> lista= queryFacById.getResultList();

        return lista;
    }
    
}
