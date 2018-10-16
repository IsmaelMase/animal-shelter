package com.proyecto.perros.refugioanimal.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.perros.refugioanimal.models.AnimalModel;
import com.proyecto.perros.refugioanimal.services.servicesImpl.AnimalServiceImpl;

@RestController
@RequestMapping("/api/animal")
@CrossOrigin("*")
public class AnimalController {

	@Autowired
	AnimalServiceImpl animalService;

	@GetMapping(value = "/animals")
	public ResponseEntity<List<AnimalModel>> getAnimalShelter() {
		return animalService.findAll();
	}

	@PostMapping(value = "/createAnimal")
	public ResponseEntity<AnimalModel> createAnimal(@Valid @RequestBody AnimalModel animal) {
		return animalService.createAnimal(animal);
	}

	@PatchMapping(value = "/removeAnimal/{id}")
	public ResponseEntity<AnimalModel> removeAnimal(@PathVariable("id") String id) {
		return animalService.removeAnimal(id);
	}

}
