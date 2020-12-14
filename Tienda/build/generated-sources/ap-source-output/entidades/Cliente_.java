package entidades;

import entidades.Factura;
import entidades.Mediopago;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-14T06:38:56")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile SingularAttribute<Cliente, String> apmat;
    public static volatile SingularAttribute<Cliente, String> telefono;
    public static volatile SingularAttribute<Cliente, Mediopago> mediopagoId;
    public static volatile SingularAttribute<Cliente, Integer> idcliente;
    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile SingularAttribute<Cliente, Integer> cp;
    public static volatile SingularAttribute<Cliente, String> email;
    public static volatile SingularAttribute<Cliente, String> appat;
    public static volatile CollectionAttribute<Cliente, Factura> facturaCollection;

}