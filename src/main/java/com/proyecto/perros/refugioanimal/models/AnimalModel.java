package com.proyecto.perros.refugioanimal.models;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class AnimalModel {

	public String id;

	public String name;

	public String breed;

	public String specie;

	public String size;

	public String age;

	public String weight;

	public boolean urgent;

	public boolean dificult;

	public String data;

	public String diseases;

	public List<String> images;

	public boolean state;

	public boolean subscribe;

	public AnimalShelterModel animalShelter;
}
