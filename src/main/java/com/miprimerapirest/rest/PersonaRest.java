package com.miprimerapirest.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miprimerapirest.dao.PersonaDAO;
import com.miprimerapirest.model.Persona;

@RestController
@RequestMapping("personas")
public class PersonaRest {
	
	@Autowired
	private PersonaDAO repository;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Persona persona) {
		repository.save(persona);
	}
	
	@GetMapping("/listar")
	public List<Persona> listar(){
		return repository.findAll();
	}
	
	@DeleteMapping("/borrar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		repository.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Persona persona) {
		repository.save(persona);
	}
	

}
