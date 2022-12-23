package ca.qc.bdeb.projetSynthese.services;

import java.util.List;

import ca.qc.bdeb.projetSynthese.models.CommandeProduct;
import ca.qc.bdeb.projetSynthese.models.Product;

public interface CommandeProductServiceInterface {
void delete(int commandeId,int productId);
void update(CommandeProduct commandeProduct,int commandeId,int productId);
List<Product> getAllProductByCommande(int commandeId);
}
