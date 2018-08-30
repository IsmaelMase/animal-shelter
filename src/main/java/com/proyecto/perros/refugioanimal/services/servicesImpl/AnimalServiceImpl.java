package com.proyecto.perros.refugioanimal.services.servicesImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.proyecto.perros.refugioanimal.converters.AnimalConverter;
import com.proyecto.perros.refugioanimal.entities.Animal;
import com.proyecto.perros.refugioanimal.models.AnimalModel;
import com.proyecto.perros.refugioanimal.repositories.AnimalRepository;
import com.proyecto.perros.refugioanimal.services.AnimalService;

@Service("animalService")
public class AnimalServiceImpl implements AnimalService {

	@Autowired
	AnimalConverter animalConverter;

	@Autowired
	AnimalRepository animalRepository;

	@Override
	public ResponseEntity<AnimalModel> createAnimal(AnimalModel animal) {
		try {

			Animal saveAnimal = animalRepository.save(animalConverter.converterModelToEntity(animal));

			return new ResponseEntity<AnimalModel>(animalConverter.converterEntityToModel(saveAnimal),
					HttpStatus.CREATED);

		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		}
	}

	@Override
	public ResponseEntity<AnimalModel> removeAnimal(String idAnimal) {
		try {
			Animal animal = animalRepository.findById(idAnimal).get();
			animal.subscribe = !animal.subscribe;
			return createAnimal(animalConverter.converterEntityToModel(animal));
		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		}
	}

	@Override
	public ResponseEntity<List<AnimalModel>> findAll() {
		try {
			ArrayList<AnimalModel> animalsModel = new ArrayList<>();
			for (Animal animal : animalRepository.findBySubscribe(true)) {
				animalsModel.add(animalConverter.converterEntityToModel(animal));
			}

			return new ResponseEntity<List<AnimalModel>>(animalsModel, HttpStatus.CREATED);

		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		}
	}

}
