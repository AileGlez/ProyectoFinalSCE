package entidades;

import entidades.Articulo;
import entidades.Envio;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-14T00:07:12")
@StaticMetamodel(Empresa.class)
public class Empresa_ { 

    public static volatile CollectionAttribute<Empresa, Envio> envioCollection;
    public static volatile SingularAttribute<Empresa, Integer> idempresa;
    public static volatile CollectionAttribute<Empresa, Articulo> articuloCollection;
    public static volatile SingularAttribute<Empresa, String> nombre;

}