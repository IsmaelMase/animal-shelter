package com.proyecto.perros.refugioanimal.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class Address {

	public String name;

	public String post_code;

	public String location;

	public String province;

	public String contry;

}
