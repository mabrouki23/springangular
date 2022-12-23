package ca.qc.bdeb.projetSynthese;


import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import aj.org.objectweb.asm.Type;
import ca.qc.bdeb.projetSynthese.models.Category;
import ca.qc.bdeb.projetSynthese.models.Product;
import ca.qc.bdeb.projetSynthese.repositories.ProductRepository;
import ca.qc.bdeb.projetSynthese.services.ProductServiceImpl;
import ca.qc.bdeb.projetSynthese.services.ProductServiceInterface;

@SpringBootApplication
@Configuration
public class projetSynthese  {	
	
	public static void main(String[] args) {
		SpringApplication.run(projetSynthese.class, args);
	}
	 
	

}
