package entidades;

import entidades.Empresa;
import entidades.Factura;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-14T18:01:02")
@StaticMetamodel(Articulo.class)
public class Articulo_ { 

    public static volatile SingularAttribute<Articulo, BigDecimal> precio;
    public static volatile SingularAttribute<Articulo, Empresa> empresaId;
    public static volatile SingularAttribute<Articulo, String> isbn;
    public static volatile SingularAttribute<Articulo, Integer> stock;
    public static volatile SingularAttribute<Articulo, String> nombre;
    public static volatile CollectionAttribute<Articulo, Factura> facturaCollection;

}