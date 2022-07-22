package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {

	@Id
	private String nombre;
	private String municipio;

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
}
