package com.app.interr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.app.interr.models.Profesor;

import com.app.interr.services.ProfesorServices;




@RestController
@RequestMapping("/api/profesores")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class ProfesorController {

    @Autowired
    private ProfesorServices profesorServices; 
	
	@GetMapping
	public List<Profesor> findAll(){
		return this.profesorServices.getAllProfesores();
	}
	
}
