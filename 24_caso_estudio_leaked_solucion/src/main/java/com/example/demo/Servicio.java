package com.example.demo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Servicio {
	
	@PersistenceContext
	private EntityManager em;

	public Persona consultaPersona (long id) {
		
		return em.find(Persona.class, id);
	}

	
}
