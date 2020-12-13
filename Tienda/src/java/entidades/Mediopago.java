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
@Table(name = "MEDIOPAGO", catalog = "", schema = "APP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mediopago.findAll", query = "SELECT m FROM Mediopago m")
    , @NamedQuery(name = "Mediopago.findByIdmedpago", query = "SELECT m FROM Mediopago m WHERE m.idmedpago = :idmedpago")
    , @NamedQuery(name = "Mediopago.findByFondos", query = "SELECT m FROM Mediopago m WHERE m.fondos = :fondos")})
public class Mediopago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDMEDPAGO", nullable = false)
    private Integer idmedpago;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "FONDOS", nullable = false, precision = 8, scale = 2)
    private BigDecimal fondos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mediopagoId")
    private Collection<Cliente> clienteCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mediopagoId")
    private Collection<Factura> facturaCollection;

    public Mediopago() {
    }

    public Mediopago(Integer idmedpago) {
        this.idmedpago = idmedpago;
    }

    public Mediopago(Integer idmedpago, BigDecimal fondos) {
        this.idmedpago = idmedpago;
        this.fondos = fondos;
    }

    public Integer getIdmedpago() {
        return idmedpago;
    }

    public void setIdmedpago(Integer idmedpago) {
        this.idmedpago = idmedpago;
    }

    public BigDecimal getFondos() {
        return fondos;
    }

    public void setFondos(BigDecimal fondos) {
        this.fondos = fondos;
    }

    @XmlTransient
    public Collection<Cliente> getClienteCollection() {
        return clienteCollection;
    }

    public void setClienteCollection(Collection<Cliente> clienteCollection) {
        this.clienteCollection = clienteCollection;
    }

    @XmlTransient
    public Collection<Factura> getFacturaCollection() {
        return facturaCollection;
    }

    public void setFacturaCollection(Collection<Factura> facturaCollection) {
        this.facturaCollection = facturaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmedpago != null ? idmedpago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mediopago)) {
            return false;
        }
        Mediopago other = (Mediopago) object;
        if ((this.idmedpago == null && other.idmedpago != null) || (this.idmedpago != null && !this.idmedpago.equals(other.idmedpago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Mediopago[ idmedpago=" + idmedpago + " ]";
    }
    
}
