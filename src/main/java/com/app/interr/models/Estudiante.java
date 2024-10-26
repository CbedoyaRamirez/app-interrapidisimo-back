package com.app.interr.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiantes")
public class Estudiante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String cedula;
	
	private String nombre;
	
	private int materia_id;
	
	private int profesor_id;

 	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getMateria_id() {
		return materia_id;
	}

	public void setMateria_id(int materia_id) {
		this.materia_id = materia_id;
	}
	
	public int getProfesor_id() {
		return profesor_id;
	}

	public void setProfesor_id(int profesor_id) {
		this.profesor_id = profesor_id;
	}
	
}
