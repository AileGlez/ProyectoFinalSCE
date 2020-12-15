
package wsEntregas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para envio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="envio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="empresaId" type="{http://wsenvios/}empresa" minOccurs="0"/>
 *         &lt;element name="facturaId" type="{http://wsenvios/}factura" minOccurs="0"/>
 *         &lt;element name="fechaentrega" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idenvio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "envio", propOrder = {
    "empresaId",
    "facturaId",
    "fechaentrega",
    "idenvio"
})
public class Envio {

    protected Empresa empresaId;
    protected Factura facturaId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaentrega;
    protected Integer idenvio;

    /**
     * Obtiene el valor de la propiedad empresaId.
     * 
     * @return
     *     possible object is
     *     {@link Empresa }
     *     
     */
    public Empresa getEmpresaId() {
        return empresaId;
    }

    /**
     * Define el valor de la propiedad empresaId.
     * 
     * @param value
     *     allowed object is
     *     {@link Empresa }
     *     
     */
    public void setEmpresaId(Empresa value) {
        this.empresaId = value;
    }

    /**
     * Obtiene el valor de la propiedad facturaId.
     * 
     * @return
     *     possible object is
     *     {@link Factura }
     *     
     */
    public Factura getFacturaId() {
        return facturaId;
    }

    /**
     * Define el valor de la propiedad facturaId.
     * 
     * @param value
     *     allowed object is
     *     {@link Factura }
     *     
     */
    public void setFacturaId(Factura value) {
        this.facturaId = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaentrega.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaentrega() {
        return fechaentrega;
    }

    /**
     * Define el valor de la propiedad fechaentrega.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaentrega(XMLGregorianCalendar value) {
        this.fechaentrega = value;
    }

    /**
     * Obtiene el valor de la propiedad idenvio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdenvio() {
        return idenvio;
    }

    /**
     * Define el valor de la propiedad idenvio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdenvio(Integer value) {
        this.idenvio = value;
    }

}
