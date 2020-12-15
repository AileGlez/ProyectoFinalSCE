package entidades;

import entidades.Cliente;
import entidades.Factura;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-15T12:22:43")
@StaticMetamodel(Mediopago.class)
public class Mediopago_ { 

    public static volatile SingularAttribute<Mediopago, Integer> idmedpago;
    public static volatile SingularAttribute<Mediopago, BigDecimal> fondos;
    public static volatile CollectionAttribute<Mediopago, Cliente> clienteCollection;
    public static volatile CollectionAttribute<Mediopago, Factura> facturaCollection;

}