package ca.qc.bdeb.projetSynthese.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.qc.bdeb.projetSynthese.models.Product;
import ca.qc.bdeb.projetSynthese.repositories.ProductRepository;
@Service
public class ProductServiceImpl implements ProductServiceInterface {
@Autowired
	private ProductRepository productRepository;
	
	

}
