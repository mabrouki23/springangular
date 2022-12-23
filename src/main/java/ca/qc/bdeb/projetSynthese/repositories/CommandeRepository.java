package ca.qc.bdeb.projetSynthese.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import ca.qc.bdeb.projetSynthese.models.Commande;
@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "commandes", path = "commandes")
public interface CommandeRepository extends JpaRepository<Commande, Integer> {

}
