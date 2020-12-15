/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontera;

import entidades.Cliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author tabat
 */
@Stateless
public class ClienteFacade extends AbstractFacade<Cliente> {

    @PersistenceContext(unitName = "TiendaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClienteFacade() {
        super(Cliente.class);
    }
    
    public java.util.List<Cliente> findByIdcliente(int id)
    {
        em = getEntityManager();
        TypedQuery<Cliente> queryClienteById = em.createNamedQuery("Cliente.findByIdcliente", Cliente.class);
        queryClienteById.setParameter("idcliente", id);
        java.util.List<Cliente> lista= queryClienteById.getResultList();

        return lista;
    }
    
}
