
package wsEntregas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for envio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the empresaId property.
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
     * Sets the value of the empresaId property.
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
     * Gets the value of the facturaId property.
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
     * Sets the value of the facturaId property.
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
     * Gets the value of the fechaentrega property.
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
     * Sets the value of the fechaentrega property.
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
     * Gets the value of the idenvio property.
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
     * Sets the value of the idenvio property.
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
