package ca.qc.bdeb.projetSynthese.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import ca.qc.bdeb.projetSynthese.services.CategoryServiceImpl;

public class CategoryController {
	@Autowired
	private CategoryServiceImpl categoryServiceImpl;
}
