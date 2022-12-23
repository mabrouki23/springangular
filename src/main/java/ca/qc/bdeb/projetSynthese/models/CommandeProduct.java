package ca.qc.bdeb.projetSynthese.models;


import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.springframework.data.annotation.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 *
 * @author User
 */
@Entity
@Table(name = "commande_product")
@IdClass(CommandeProductPK.class)
public class CommandeProduct { 
    @Id
	Integer commandeId;
    @Id
    Integer productId;   
    
    @Column(name = "quantite")
    private Integer quantite;
    @JoinColumn(name = "commande_id", referencedColumnName = "commande_id", insertable = false, updatable = false)
    @JsonIgnoreProperties("commande")
    @ManyToOne(optional = false ,fetch = FetchType.LAZY)    
    private Commande commande;
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)    
    private Product product;
   
    public Integer getCommandeId() {
		return commandeId;
	}

	public void setCommandeId(Integer commandeId) {
		this.commandeId = commandeId;
	}
	
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	
    public CommandeProduct() {
    }

    

    public void setQuantity(Integer quantite) {
        this.quantite = quantite;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

	public CommandeProduct(Integer commandeId, Integer productId, Integer quantite) {
		
		this.commandeId = commandeId;
		this.productId = productId;
		this.quantite = quantite;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(commande, commandeId, product, productId, quantite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommandeProduct other = (CommandeProduct) obj;
		return Objects.equals(commande, other.commande) && Objects.equals(commandeId, other.commandeId)
				&& Objects.equals(product, other.product) && Objects.equals(productId, other.productId)
				&& Objects.equals(quantite, other.quantite);
	}

	@Override
	public String toString() {
		return "CommandeProduct [commandeId=" + commandeId + ", productId=" + productId + ", quantite=" + quantite
				+ ", commande=" + commande + ", product=" + product + "]";
	}
    

   
    
}
