package com.expert.baseRestApi.accessRepository;

import java.util.Optional;


import org.springframework.data.repository.CrudRepository;

import com.expert.baseRestApi.model.Utilisateur;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, String> {
	
	
  Utilisateur findByEmail(String email) ;
	
}
