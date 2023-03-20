package com.expert.baseRestApi.accessRepository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.expert.baseRestApi.model.Utilisateur;

public class UtilisateurRepository implements CrudRepository<Utilisateur, Utilisateur> {
	
	
	public void findByEmail(String email) {
		
	}

	@Override
	public <S extends Utilisateur> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Utilisateur> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Utilisateur> findById(Utilisateur id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Utilisateur id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Utilisateur> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Utilisateur> findAllById(Iterable<Utilisateur> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Utilisateur id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Utilisateur entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Utilisateur> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Utilisateur> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
}
