package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name ="CURSO")
@Data
@AllArgsConstructor
public class Curso {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "precio")
	private int precio;
	
	@Column(name = "horas")
	private int horas;

	public Curso() {
		super();
	}
	
}
