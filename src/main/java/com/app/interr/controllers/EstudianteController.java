package com.app.interr.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.interr.models.Estudiante;
import com.app.interr.models.EstudianteCompartidoDTO;
import com.app.interr.services.EstudianteService;




@RestController
@RequestMapping("/api/estudiante")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService; 
	
	@GetMapping
	public List<Estudiante> findAll(){
		return this.estudianteService.getAllEstudiantes();
	}
	
    @PostMapping("/add")
    public ResponseEntity<Estudiante> addEstudiante(@RequestBody Estudiante estudiante) {
        try {
            Estudiante nuevoEstudiante = estudianteService.addEstudiante(estudiante);
            return new ResponseEntity<>(nuevoEstudiante, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }	
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMateriaEstudiante(@PathVariable int id) {
        try {
        	estudianteService.deleteMateria(id);
        	return ResponseEntity.status(HttpStatus.OK).body("Materia eliminada correctamente");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }    
    
    @GetMapping("/companeros")
    public List<Object[]> getCompaneros(@RequestParam String cedula) {
        return estudianteService.findCompanerosByCedula(cedula);
    }    
	
}
