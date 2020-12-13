/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author tabat
 */
@Entity
@Table(name = "FACTURA", catalog = "", schema = "APP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query = "SELECT f FROM Factura f")
    , @NamedQuery(name = "Factura.findByIdfactura", query = "SELECT f FROM Factura f WHERE f.idfactura = :idfactura")
    , @NamedQuery(name = "Factura.findByCantidad", query = "SELECT f FROM Factura f WHERE f.cantidad = :cantidad")
    , @NamedQuery(name = "Factura.findByTotalapagar", query = "SELECT f FROM Factura f WHERE f.totalapagar = :totalapagar")})
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDFACTURA", nullable = false)
    private Integer idfactura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD", nullable = false)
    private int cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTALAPAGAR", nullable = false, precision = 8, scale = 2)
    private BigDecimal totalapagar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facturaId")
    private Collection<Envio> envioCollection;
    @JoinColumn(name = "ARTICULO_ISBN", referencedColumnName = "ISBN", nullable = false)
    @ManyToOne(optional = false)
    private Articulo articuloIsbn;
    @JoinColumn(name = "CLIENTE_ID", referencedColumnName = "IDCLIENTE", nullable = false)
    @ManyToOne(optional = false)
    private Cliente clienteId;
    @JoinColumn(name = "MEDIOPAGO_ID", referencedColumnName = "IDMEDPAGO", nullable = false)
    @ManyToOne(optional = false)
    private Mediopago mediopagoId;

    public Factura() {
    }

    public Factura(Integer idfactura) {
        this.idfactura = idfactura;
    }

    public Factura(Integer idfactura, int cantidad, BigDecimal totalapagar) {
        this.idfactura = idfactura;
        this.cantidad = cantidad;
        this.totalapagar = totalapagar;
    }

    public Integer getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Integer idfactura) {
        this.idfactura = idfactura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotalapagar() {
        return totalapagar;
    }

    public void setTotalapagar(BigDecimal totalapagar) {
        this.totalapagar = totalapagar;
    }

    @XmlTransient
    public Collection<Envio> getEnvioCollection() {
        return envioCollection;
    }

    public void setEnvioCollection(Collection<Envio> envioCollection) {
        this.envioCollection = envioCollection;
    }

    public Articulo getArticuloIsbn() {
        return articuloIsbn;
    }

    public void setArticuloIsbn(Articulo articuloIsbn) {
        this.articuloIsbn = articuloIsbn;
    }

    public Cliente getClienteId() {
        return clienteId;
    }

    public void setClienteId(Cliente clienteId) {
        this.clienteId = clienteId;
    }

    public Mediopago getMediopagoId() {
        return mediopagoId;
    }

    public void setMediopagoId(Mediopago mediopagoId) {
        this.mediopagoId = mediopagoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfactura != null ? idfactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.idfactura == null && other.idfactura != null) || (this.idfactura != null && !this.idfactura.equals(other.idfactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Factura[ idfactura=" + idfactura + " ]";
    }
    
}
