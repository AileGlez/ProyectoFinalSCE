
package wsEntregas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cliente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cliente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apmat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idcliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mediopagoId" type="{http://wsenvios/}mediopago" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cliente", propOrder = {
    "apmat",
    "appat",
    "cp",
    "direccion",
    "email",
    "idcliente",
    "mediopagoId",
    "nombre",
    "telefono"
})
public class Cliente {

    protected String apmat;
    protected String appat;
    protected int cp;
    protected String direccion;
    protected String email;
    protected Integer idcliente;
    protected Mediopago mediopagoId;
    protected String nombre;
    protected String telefono;

    /**
     * Gets the value of the apmat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApmat() {
        return apmat;
    }

    /**
     * Sets the value of the apmat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApmat(String value) {
        this.apmat = value;
    }

    /**
     * Gets the value of the appat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppat() {
        return appat;
    }

    /**
     * Sets the value of the appat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppat(String value) {
        this.appat = value;
    }

    /**
     * Gets the value of the cp property.
     * 
     */
    public int getCp() {
        return cp;
    }

    /**
     * Sets the value of the cp property.
     * 
     */
    public void setCp(int value) {
        this.cp = value;
    }

    /**
     * Gets the value of the direccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the idcliente property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdcliente() {
        return idcliente;
    }

    /**
     * Sets the value of the idcliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdcliente(Integer value) {
        this.idcliente = value;
    }

    /**
     * Gets the value of the mediopagoId property.
     * 
     * @return
     *     possible object is
     *     {@link Mediopago }
     *     
     */
    public Mediopago getMediopagoId() {
        return mediopagoId;
    }

    /**
     * Sets the value of the mediopagoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mediopago }
     *     
     */
    public void setMediopagoId(Mediopago value) {
        this.mediopagoId = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the telefono property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

}
