package com.expert.baseRestApi.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Utilisateur implements Serializable{
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Long getId() {
			return id;
		}

		private String nom;
	    private String prenom;
		private String password;
		@Column(unique=true)
		private String email;
		
		public Utilisateur() {
			// TODO Auto-generated constructor stub
		}
		
		public Utilisateur(Long id, String nom, String prenom, String password, String email) {
			super();
			this.id = id;
			this.nom = nom;
			this.prenom = prenom;
			this.password = password;
			this.email=email;
		}
}
