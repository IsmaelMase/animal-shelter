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

import com.proyecto.perros.refugioanimal.models.AnimalShelterModel;
import com.proyecto.perros.refugioanimal.services.servicesImpl.AnimalShelterServiceImpl;

@RestController
@RequestMapping("/api/animalShelter")
@CrossOrigin("*")
public class AnimalShelterController {

	@Autowired
	AnimalShelterServiceImpl animalShelterService;

	@GetMapping(value = "/animalShelters")
	public ResponseEntity<List<AnimalShelterModel>> getAnimalShelter() {
		return animalShelterService.findAll();
	}

	@GetMapping(value = "/animalShelterByIdentityCode/{code}")
	public ResponseEntity<AnimalShelterModel> getAnimalShelterByIdentityCode(@PathVariable("code") String code) {
		return animalShelterService.findByIdentityCode(code);
	}

	@PostMapping(value = "/susbcribeShelter")
	public ResponseEntity<AnimalShelterModel> subscribeAnimalShelter(@Valid @RequestBody AnimalShelterModel shelter) {
		return animalShelterService.subscribeShelter(shelter);
	}

	@PatchMapping(value = "/changeSubscribeShelter/{id}")
	public ResponseEntity<AnimalShelterModel> unsubscribeAnimalShelter(@PathVariable("id") String id) {
		return animalShelterService.changeSubscribeShelter(id);
	}
}
