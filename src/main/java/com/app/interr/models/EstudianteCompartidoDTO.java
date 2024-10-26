package com.app.interr.models;

public class EstudianteCompartidoDTO {
	
	private String materia;
	private String nombre;
	
    public EstudianteCompartidoDTO(String nombre, String materia) {
        this.nombre = nombre;
        this.materia = materia;
    }	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
}
