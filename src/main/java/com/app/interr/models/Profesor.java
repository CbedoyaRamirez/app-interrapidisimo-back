package com.app.interr.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesores")
public class Profesor {

	@Id
	private int id;
	private String nombres;
	private int id_materia1;
	private int id_materia2;

 	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public int getId_materia1() {
		return id_materia1;
	}

	public void setId_materia1(int id_materia1) {
		this.id_materia1 = id_materia1;
	}
	
	public int getId_materia2() {
		return id_materia2;
	}

	public void setId_materia2(int id_materia2) {
		this.id_materia2 = id_materia2;
	}
	
	

	
}
