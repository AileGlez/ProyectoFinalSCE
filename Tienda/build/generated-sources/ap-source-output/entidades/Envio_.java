package entidades;

import entidades.Empresa;
import entidades.Factura;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-13T23:40:47")
@StaticMetamodel(Envio.class)
public class Envio_ { 

    public static volatile SingularAttribute<Envio, Date> fechaentrega;
    public static volatile SingularAttribute<Envio, Empresa> empresaId;
    public static volatile SingularAttribute<Envio, Factura> facturaId;
    public static volatile SingularAttribute<Envio, Integer> idenvio;

}