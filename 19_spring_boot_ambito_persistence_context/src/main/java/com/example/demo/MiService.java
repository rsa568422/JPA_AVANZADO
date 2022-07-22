package com.example.demo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MiService {

	@PersistenceContext
	private EntityManager em;
	
	public Persona crea (String nombre, String municipio) {
		Persona nueva = new Persona();
		nueva.setNombre(nombre);
		nueva.setMunicipio(municipio);
		
		em.persist(nueva);
		
		return nueva;
	}
	
	public Persona consulta (String nombre) {
		return em.getReference(Persona.class, nombre);
	}
}
