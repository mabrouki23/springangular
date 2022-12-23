package ca.qc.bdeb.projetSynthese.services;

import org.springframework.beans.factory.annotation.Autowired;

import ca.qc.bdeb.projetSynthese.repositories.CommandeRepository;

public class CommandeServiceImpl implements CommandeServiceInterface {
	@Autowired
	private CommandeRepository commandeRepository;
}
