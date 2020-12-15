
package wsEntregas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad apmat.
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
     * Define el valor de la propiedad apmat.
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
     * Obtiene el valor de la propiedad appat.
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
     * Define el valor de la propiedad appat.
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
     * Obtiene el valor de la propiedad cp.
     * 
     */
    public int getCp() {
        return cp;
    }

    /**
     * Define el valor de la propiedad cp.
     * 
     */
    public void setCp(int value) {
        this.cp = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
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
     * Define el valor de la propiedad direccion.
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
     * Obtiene el valor de la propiedad email.
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
     * Define el valor de la propiedad email.
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
     * Obtiene el valor de la propiedad idcliente.
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
     * Define el valor de la propiedad idcliente.
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
     * Obtiene el valor de la propiedad mediopagoId.
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
     * Define el valor de la propiedad mediopagoId.
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
     * Obtiene el valor de la propiedad nombre.
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
     * Define el valor de la propiedad nombre.
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
     * Obtiene el valor de la propiedad telefono.
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
     * Define el valor de la propiedad telefono.
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
