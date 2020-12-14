
package wsEntregas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for factura complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="factura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="articuloIsbn" type="{http://wsenvios/}articulo" minOccurs="0"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="clienteId" type="{http://wsenvios/}cliente" minOccurs="0"/>
 *         &lt;element name="idfactura" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mediopagoId" type="{http://wsenvios/}mediopago" minOccurs="0"/>
 *         &lt;element name="totalapagar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "factura", propOrder = {
    "articuloIsbn",
    "cantidad",
    "clienteId",
    "idfactura",
    "mediopagoId",
    "totalapagar"
})
public class Factura {

    protected Articulo articuloIsbn;
    protected int cantidad;
    protected Cliente clienteId;
    protected Integer idfactura;
    protected Mediopago mediopagoId;
    protected BigDecimal totalapagar;

    /**
     * Gets the value of the articuloIsbn property.
     * 
     * @return
     *     possible object is
     *     {@link Articulo }
     *     
     */
    public Articulo getArticuloIsbn() {
        return articuloIsbn;
    }

    /**
     * Sets the value of the articuloIsbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Articulo }
     *     
     */
    public void setArticuloIsbn(Articulo value) {
        this.articuloIsbn = value;
    }

    /**
     * Gets the value of the cantidad property.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Gets the value of the clienteId property.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getClienteId() {
        return clienteId;
    }

    /**
     * Sets the value of the clienteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setClienteId(Cliente value) {
        this.clienteId = value;
    }

    /**
     * Gets the value of the idfactura property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdfactura() {
        return idfactura;
    }

    /**
     * Sets the value of the idfactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdfactura(Integer value) {
        this.idfactura = value;
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
     * Gets the value of the totalapagar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalapagar() {
        return totalapagar;
    }

    /**
     * Sets the value of the totalapagar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalapagar(BigDecimal value) {
        this.totalapagar = value;
    }

}
