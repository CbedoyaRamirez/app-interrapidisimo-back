package com.app.interr.models;

public class Estudiante {

	private int id;
	private String nombre;
	private int materia_id;
	private int profesor_id;

	public Estudiante(int id, String nombre, int materia_id, int profesor_id) {
		this.id = id;
		this.nombre = nombre;
		this.materia_id = materia_id;
		this.profesor_id = profesor_id;
	}

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
