package com.expert.baseRestApi.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Utilisateur implements Serializable{
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String nom;
	    private String prenom;
		private String password;
		
		public Utilisateur() {
			// TODO Auto-generated constructor stub
		}
		
		public Utilisateur(Long id, String nom, String prenom, String password) {
			super();
			this.id = id;
			this.nom = nom;
			this.prenom = prenom;
			this.password = password;
		}
}
