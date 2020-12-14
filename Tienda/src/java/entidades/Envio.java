/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tabat
 */
@Entity
@Table(name = "ENVIO", catalog = "", schema = "APP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Envio.findAll", query = "SELECT e FROM Envio e")
    , @NamedQuery(name = "Envio.findByIdenvio", query = "SELECT e FROM Envio e WHERE e.idenvio = :idenvio")
    , @NamedQuery(name = "Envio.findByFechaEntrega", query = "SELECT e FROM Envio e WHERE e.fechaentrega <= :deliveryDate")})
public class Envio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDENVIO", nullable = false)
    private Integer idenvio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHAENTREGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaentrega;
    @JoinColumn(name = "EMPRESA_ID", referencedColumnName = "IDEMPRESA", nullable = false)
    @ManyToOne(optional = false)
    private Empresa empresaId;
    @JoinColumn(name = "FACTURA_ID", referencedColumnName = "IDFACTURA", nullable = false)
    @ManyToOne(optional = false)
    private Factura facturaId;


    public Envio() {
    }

    public Envio(Integer idenvio) {
        this.idenvio = idenvio;
    }

    public Envio(Integer idenvio, Date fechaentrega) {
        this.idenvio = idenvio;
        this.fechaentrega = fechaentrega;
    }

    public Integer getIdenvio() {
        return idenvio;
    }

    public void setIdenvio(Integer idenvio) {
        this.idenvio = idenvio;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public Empresa getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Empresa empresaId) {
        this.empresaId = empresaId;
    }

    public Factura getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Factura facturaId) {
        this.facturaId = facturaId;
    }
    
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idenvio != null ? idenvio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Envio)) {
            return false;
        }
        Envio other = (Envio) object;
        if ((this.idenvio == null && other.idenvio != null) || (this.idenvio != null && !this.idenvio.equals(other.idenvio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Envio[ idenvio=" + idenvio + " ]";
    }
    
    
}
