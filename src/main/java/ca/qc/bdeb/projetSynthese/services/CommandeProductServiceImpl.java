package ca.qc.bdeb.projetSynthese.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.qc.bdeb.projetSynthese.models.CommandeProduct;
import ca.qc.bdeb.projetSynthese.models.CommandeProductPK;
import ca.qc.bdeb.projetSynthese.models.Product;
import ca.qc.bdeb.projetSynthese.repositories.CommandeProductsRepository;
@Service

@Transactional
public class CommandeProductServiceImpl implements CommandeProductServiceInterface{
	@Autowired
	private CommandeProductsRepository commandeProductsRepository;

	@Override
	public void delete(int commandeId, int productId) {
		CommandeProductPK commandeProductPK =new CommandeProductPK(commandeId,productId);
		this.commandeProductsRepository.deleteById(commandeProductPK);
		
	}

	@Override
	public void update(CommandeProduct commandeProduct, int commandeId, int productId) {
		CommandeProductPK commandeProductPK =new CommandeProductPK(commandeId,productId);
		Optional<CommandeProduct> commandeProduct1=this.commandeProductsRepository.findById(commandeProductPK);
		CommandeProduct commandeProduct2=commandeProduct1.get();
		commandeProduct2.setQuantity(commandeProduct.getQuantite());		
		commandeProductsRepository.save(commandeProduct2);
		
	}

	@Override
	public List<Product> getAllProductByCommande(int commandeId) {
		
		return commandeProductsRepository.findByCommande(commandeId);
	}

}
