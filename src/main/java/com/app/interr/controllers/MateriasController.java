package com.app.interr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.interr.models.Materia;
import com.app.interr.services.MateriaServices;

@RestController
@RequestMapping("/api/materias")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class MateriasController {

    @Autowired
    private MateriaServices materiaServices; 
	
	@GetMapping
	public List<Materia> findAll(){
		return this.materiaServices.getAllMaterias();
	}
	
}
