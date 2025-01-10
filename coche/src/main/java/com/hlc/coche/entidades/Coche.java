package com.hlc.coche.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Coche {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String Marca;
	private String Matricula;
	private String Color;
	
	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Coche(String marca, String matricula, String color) {
		super();
		Marca = marca;
		Matricula = matricula;
		Color = color;
	}



	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getMarca() {
		return Marca;
	}
	
	public void setMarca(String marca) {
		Marca = marca;
	}
	
	public String getMatricula() {
		return Matricula;
	}
	
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	
	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	} 
	
	
}
