
package wsEntregas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para factura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad articuloIsbn.
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
     * Define el valor de la propiedad articuloIsbn.
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
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteId.
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
     * Define el valor de la propiedad clienteId.
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
     * Obtiene el valor de la propiedad idfactura.
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
     * Define el valor de la propiedad idfactura.
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
     * Obtiene el valor de la propiedad totalapagar.
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
     * Define el valor de la propiedad totalapagar.
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
