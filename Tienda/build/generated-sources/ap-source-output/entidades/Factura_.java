package entidades;

import entidades.Articulo;
import entidades.Cliente;
import entidades.Envio;
import entidades.Mediopago;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-15T09:47:20")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile CollectionAttribute<Factura, Envio> envioCollection;
    public static volatile SingularAttribute<Factura, Cliente> clienteId;
    public static volatile SingularAttribute<Factura, BigDecimal> totalapagar;
    public static volatile SingularAttribute<Factura, Articulo> articuloIsbn;
    public static volatile SingularAttribute<Factura, Integer> cantidad;
    public static volatile SingularAttribute<Factura, Mediopago> mediopagoId;
    public static volatile SingularAttribute<Factura, Integer> idfactura;

}