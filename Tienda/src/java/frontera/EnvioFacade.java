/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontera;

import entidades.Articulo;
import entidades.Envio;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author tabat
 */
@Stateless
public class EnvioFacade extends AbstractFacade<Envio> {

    @PersistenceContext(unitName = "TiendaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EnvioFacade() {
        super(Envio.class);
    }

    public List<Envio> findByFechaEntrega(Date deliveryDate) throws ParseException {
        em = getEntityManager();
        TypedQuery<Envio> queryByName = em.createNamedQuery("Envio.findByFechaEntrega", Envio.class);
        queryByName.setParameter("deliveryDate", deliveryDate);
        List<Envio> listaEntrega = queryByName.getResultList();
        return listaEntrega;
    }
}
