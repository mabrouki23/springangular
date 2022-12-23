package ca.qc.bdeb.projetSynthese.services;

import org.springframework.beans.factory.annotation.Autowired;

import ca.qc.bdeb.projetSynthese.repositories.CategoryRepository;

public class CategoryServiceImpl implements CategoryServiceInterface{
	@Autowired
	private CategoryRepository categoryRepository;

}
