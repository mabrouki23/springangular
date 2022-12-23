package ca.qc.bdeb.projetSynthese.models;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;

/**
 *
 * @author User
 */
@Embeddable
public class CommandeProductPK implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "commande_id")
    
    private int commandeId;
    @Basic(optional = false)
    @Column(name = "product_id")
   
    private int productId;

    public CommandeProductPK() {
    }

    public CommandeProductPK(int commandeId, int productId) {
        this.commandeId = commandeId;
        this.productId = productId;
    }

    public int getCommandeId() {
        return commandeId;
    }

    public void setCommandeId(int commandeId) {
        this.commandeId = commandeId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) commandeId;
        hash += (int) productId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommandeProductPK)) {
            return false;
        }
        CommandeProductPK other = (CommandeProductPK) object;
        if (this.commandeId != other.commandeId) {
            return false;
        }
        if (this.productId != other.productId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "folder.CommandeProductPK[ commandeId=" + commandeId + ", productId=" + productId + " ]";
    }
    
}
