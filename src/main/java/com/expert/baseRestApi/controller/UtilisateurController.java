package com.expert.baseRestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.expert.baseRestApi.accessRepository.UtilisateurRepository;
import com.expert.baseRestApi.model.Utilisateur;


@RestController
public class UtilisateurController {
	

	@Autowired
	private UtilisateurRepository utilisateurRepository ;


	@GetMapping("/getUser")
	public Utilisateur getUser() {
		Utilisateur u = new Utilisateur();
		
		u.setNom("Seb");
		return u;
	}

	/*@GetMapping("/findByName/{nom}")
	public Utilisateur getUser2(@PathVariable("nom") String nom) {
	 Utilisateur u = utilisateurRepository.findByNom(nom);
	return u;


	}*/

	@PostMapping("/createUser")
	public Utilisateur create(@RequestBody Utilisateur u) {
		utilisateurRepository.save(u);
		return u;
	}

	@GetMapping("/findAllUser")
	public List<Utilisateur> getAllUser() {
		return (List<Utilisateur>) utilisateurRepository.findAll();
	}

}