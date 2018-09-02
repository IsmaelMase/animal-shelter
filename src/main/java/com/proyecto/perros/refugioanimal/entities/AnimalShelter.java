package com.proyecto.perros.refugioanimal.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.proyecto.perros.refugioanimal.models.Address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "animalShelters")
public class AnimalShelter {
	@Id
	public String id;

	public String identityCode;

	public String name;

	public List<String> emails;

	public Address address;

	public List<String> phones;

	public String password;

	public String type;

	public boolean subscribe;

	public String website;

	public List<String> images;

	public String information;

}
