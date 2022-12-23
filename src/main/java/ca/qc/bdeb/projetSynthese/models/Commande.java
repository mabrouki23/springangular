package ca.qc.bdeb.projetSynthese.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 *
 * @author User
 */
@Entity
@Table(name = "commande")

@NamedQueries({
    @NamedQuery(name = "Commande.findAll", query = "SELECT c FROM Commande c"),
    @NamedQuery(name = "Commande.findByCommandeId", query = "SELECT c FROM Commande c WHERE c.commandeId = :commandeId"),
    @NamedQuery(name = "Commande.findByCommandeType", query = "SELECT c FROM Commande c WHERE c.commandeType = :commandeType"),
    @NamedQuery(name = "Commande.findByInProgress", query = "SELECT c FROM Commande c WHERE c.inProgress = :inProgress"),
    @NamedQuery(name = "Commande.findByIsCanceled", query = "SELECT c FROM Commande c WHERE c.isCanceled = :isCanceled"),
    @NamedQuery(name = "Commande.findByIsDelivered", query = "SELECT c FROM Commande c WHERE c.isDelivered = :isDelivered"),
    @NamedQuery(name = "Commande.findByIsPaid", query = "SELECT c FROM Commande c WHERE c.isPaid = :isPaid"),
    @NamedQuery(name = "Commande.findByIsReady", query = "SELECT c FROM Commande c WHERE c.isReady = :isReady"),
    @NamedQuery(name = "Commande.findByPaymentType", query = "SELECT c FROM Commande c WHERE c.paymentType = :paymentType"),
    @NamedQuery(name = "Commande.findByTaxPrice", query = "SELECT c FROM Commande c WHERE c.taxPrice = :taxPrice"),
    @NamedQuery(name = "Commande.findByTotalPrice", query = "SELECT c FROM Commande c WHERE c.totalPrice = :totalPrice")})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "commandeId")
public class Commande implements Serializable {   
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "commande_id")
    private Integer commandeId;
    @Column(name = "commande_type")
    private String commandeType;
    @Basic(optional = false)
    @Column(name = "in_progress")
    private boolean inProgress;
    @Basic(optional = false)
    @Column(name = "is_canceled")
    private boolean isCanceled;
    @Basic(optional = false)
    @Column(name = "is_delivered")
    private boolean isDelivered;
    @Basic(optional = false)
    @Column(name = "is_paid")
    private boolean isPaid;
    @Basic(optional = false)
    @Column(name = "is_ready")
    private boolean isReady;
    @Column(name = "payment_type")
    private String paymentType;
    @Basic(optional = false)
    @Column(name = "tax_price")
    private double taxPrice;
    @Basic(optional = false)
    @Column(name = "total_price")
    private double totalPrice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "commande") 

 private Set<CommandeProduct> commandeProducts=new HashSet<CommandeProduct>();

    public Commande() {
    }

    public Commande(Integer commandeId) {
        this.commandeId = commandeId;
    }

    public Commande(Integer commandeId, boolean inProgress, boolean isCanceled, boolean isDelivered, boolean isPaid, boolean isReady, double taxPrice, double totalPrice) {
        this.commandeId = commandeId;
        this.inProgress = inProgress;
        this.isCanceled = isCanceled;
        this.isDelivered = isDelivered;
        this.isPaid = isPaid;
        this.isReady = isReady;
        this.taxPrice = taxPrice;
        this.totalPrice = totalPrice;
    }

    public Integer getCommandeId() {
        return commandeId;
    }

    public void setCommandeId(Integer commandeId) {
        this.commandeId = commandeId;
    }

    public String getCommandeType() {
        return commandeType;
    }

    public void setCommandeType(String commandeType) {
        this.commandeType = commandeType;
    }

    public boolean getInProgress() {
        return inProgress;
    }

    public void setInProgress(boolean inProgress) {
        this.inProgress = inProgress;
    }

    public boolean getIsCanceled() {
        return isCanceled;
    }

    public void setIsCanceled(boolean isCanceled) {
        this.isCanceled = isCanceled;
    }

    public boolean getIsDelivered() {
        return isDelivered;
    }

    public void setIsDelivered(boolean isDelivered) {
        this.isDelivered = isDelivered;
    }

    public boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public boolean getIsReady() {
        return isReady;
    }

    public void setIsReady(boolean isReady) {
        this.isReady = isReady;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getTaxPrice() {
        return taxPrice;
    }

    public void setTaxPrice(double taxPrice) {
        this.taxPrice = taxPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

   
    public Set<CommandeProduct> getCommandeProducts() {
        return commandeProducts;
    }

    public void setCommandeProducts(Set<CommandeProduct> commandeProducts) {
        this.commandeProducts = commandeProducts;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (commandeId != null ? commandeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.commandeId == null && other.commandeId != null) || (this.commandeId != null && !this.commandeId.equals(other.commandeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "folder.Commande[ commandeId=" + commandeId + " ]";
    }
    
}
