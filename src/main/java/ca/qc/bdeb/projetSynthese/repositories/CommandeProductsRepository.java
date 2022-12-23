package ca.qc.bdeb.projetSynthese.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import ca.qc.bdeb.projetSynthese.models.Commande;
import ca.qc.bdeb.projetSynthese.models.CommandeProduct;
import ca.qc.bdeb.projetSynthese.models.CommandeProductPK;
import ca.qc.bdeb.projetSynthese.models.Product;
@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "commandeProducts", path = "commandeProducts")
public interface CommandeProductsRepository extends JpaRepository<CommandeProduct, CommandeProductPK>{
	@Query("select p from CommandeProduct cp  join cp.product p where cp.commandeId =:id")
	public List<Product> findByCommande(@Param("id") int id);
}
