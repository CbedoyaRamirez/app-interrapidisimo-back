package com.app.interr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.interr.models.Profesor;
import com.app.interr.respositories.IProfesorRespository;

@Service
public class ProfesorServices {

	@Autowired
	IProfesorRespository iProfesorRespository;
	
		
	public List<Profesor> getAllProfesores() {
        try {
            return iProfesorRespository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Error fetching profesor");
        }
	}
	
	
}
