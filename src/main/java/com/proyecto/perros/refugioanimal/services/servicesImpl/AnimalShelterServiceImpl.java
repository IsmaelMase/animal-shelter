package com.proyecto.perros.refugioanimal.services.servicesImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.proyecto.perros.refugioanimal.converters.AnimalShelterConverter;
import com.proyecto.perros.refugioanimal.entities.AnimalShelter;
import com.proyecto.perros.refugioanimal.models.AnimalShelterModel;
import com.proyecto.perros.refugioanimal.repositories.AnimalShelterRespository;
import com.proyecto.perros.refugioanimal.services.AnimalShelterService;

@Service("animalShelterService")
public class AnimalShelterServiceImpl implements AnimalShelterService {

	@Autowired
	private AnimalShelterConverter animalShelterConverter;

	@Autowired
	private AnimalShelterRespository animalShelterRespository;

	// @Autowired
	// private PasswordEncoder passwordEncoder;

	@Override
	public ResponseEntity<AnimalShelterModel> subscribeShelter(AnimalShelterModel shelter) {
		try {
			shelter.identityCode = generateIdentityCode();
			// if (shelter.id.equals("")) {
			// shelter.password = passwordEncoder.encode(shelter.password);
			// }
			AnimalShelter saveShelter = animalShelterRespository
					.save(animalShelterConverter.convertModelToEntity(shelter));

			return new ResponseEntity<AnimalShelterModel>(animalShelterConverter.converterEntityToModel(saveShelter),
					HttpStatus.CREATED);

		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		}
	}

	@Override
	public ResponseEntity<AnimalShelterModel> changeSubscribeShelter(String idShelter) {
		try {
			AnimalShelter shelter = animalShelterRespository.findById(idShelter).get();
			shelter.subscribe = !shelter.subscribe;
			return subscribeShelter(animalShelterConverter.converterEntityToModel(shelter));
		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		}
	}

	@Override
	public ResponseEntity<List<AnimalShelterModel>> findAll() {

		try {
			ArrayList<AnimalShelterModel> shleltersModel = new ArrayList<>();
			for (AnimalShelter shelter : animalShelterRespository.findAll()) {
				shleltersModel.add(animalShelterConverter.converterEntityToModel(shelter));
			}

			return new ResponseEntity<List<AnimalShelterModel>>(shleltersModel, HttpStatus.CREATED);

		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		}

	}

	@Override
	public ResponseEntity<AnimalShelterModel> findByIdentityCode(String identityCode) {
		try {

			return new ResponseEntity<AnimalShelterModel>(animalShelterConverter.converterEntityToModel(
					animalShelterRespository.findByIdentityCode(identityCode)), HttpStatus.CREATED);

		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		}
	}

	public String generateIdentityCode() {
		String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "P", "Q", "R", "S",
				"T", "U", "V", "W", "X", "Y", "Z" };
		String[] numbers = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		String finalCode = "";
		for (int i = 0; i < 3; i++) {
			int randomNumber = (int) Math.floor(Math.random() * (1 - (25 + 1)) + (25));
			finalCode += (letters[randomNumber]);
		}
		for (int j = 0; j < 3; j++) {
			int randomNumber = (int) Math.floor(Math.random() * (1 - (10 + 1)) + (10));
			finalCode += (numbers[randomNumber]);
		}
		return finalCode;
	}

}
