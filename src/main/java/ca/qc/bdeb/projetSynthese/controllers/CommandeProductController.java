package ca.qc.bdeb.projetSynthese.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.qc.bdeb.projetSynthese.models.CommandeProduct;
import ca.qc.bdeb.projetSynthese.models.Product;
import ca.qc.bdeb.projetSynthese.services.CommandeProductServiceImpl;
@RestController
@RequestMapping(path = "/api")
public class CommandeProductController {
@Autowired
private CommandeProductServiceImpl commandeProductServiceImpl;
@CrossOrigin(origins = "*")
@DeleteMapping("/commandeProducts/{commandeId}/{productId}")
public void delete(@PathVariable("commandeId") Integer commandeId,@PathVariable("productId") Integer productId) {
	commandeProductServiceImpl.delete(commandeId, productId);
}
@CrossOrigin(origins = "*")
@PutMapping("/commandeProducts/{commandeId}/{productId}")
public void update(@RequestBody CommandeProduct commandeProduct ,@PathVariable("commandeId") Integer commandeId,@PathVariable("productId") Integer productId) {
	commandeProductServiceImpl.update(commandeProduct,commandeId, productId);
}
@CrossOrigin(origins = "*")
@GetMapping("/commandeProducts/{commandeId}/products")
public List<Product> getAllProductByCommande(@PathVariable("commandeId") int commandeId) {
	return commandeProductServiceImpl.getAllProductByCommande(commandeId);}
}
