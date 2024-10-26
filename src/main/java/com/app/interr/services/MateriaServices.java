package com.app.interr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.interr.respositories.IMateriasRepository;

@Service
public class MateriaServices {

	@Autowired
	IMateriasRepository iMateriasRepository;
	
		
	public List<com.app.interr.models.Materia> getAllMaterias() {
        try {
            return iMateriasRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Error fetching materias");
        }
	}
	
	
}
