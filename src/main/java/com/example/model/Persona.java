package com.example.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Persona {
	
	@NotNull
	@Size(min=2, max=6)
	private String nombre;
	
	@NotNull
	@Min(18)
	private int edad;

}
