package com.app.interr.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.interr.models.Estudiante;
import com.app.interr.models.EstudianteCompartidoDTO;
import com.app.interr.respositories.IEstudiantesRepository;


import io.swagger.v3.oas.annotations.parameters.RequestBody;

@Service
public class EstudianteService {

	@Autowired
	IEstudiantesRepository iEstudiantesRepository;
	
		
	public List<Estudiante> getAllEstudiantes() {
        try {
            return iEstudiantesRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Error fetching estudiantes");
        }
	}
	
	public Estudiante addEstudiante(@RequestBody Estudiante estudiante) {
        try {
            return iEstudiantesRepository.save(estudiante);
        } catch (Exception e) {
            throw new RuntimeException("Error save estudiantes");
        }
	}	
	
    public void deleteMateria(int id) {
        Optional<Estudiante> materia = iEstudiantesRepository.findById(id);
        if (materia.isPresent()) {
        	iEstudiantesRepository.delete(materia.get());
        } else {
            throw new RuntimeException("Materia no encontrada con ID: " + id);
        }
    }	
    
    public List<Object[]> findCompanerosByCedula(String cedula) {
        return iEstudiantesRepository.findCompanerosByCedula(cedula);
    }    
    
	
}
