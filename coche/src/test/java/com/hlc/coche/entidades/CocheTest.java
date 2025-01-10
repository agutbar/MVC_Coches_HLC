package com.hlc.coche.entidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CocheTest {
	
	private Coche coche;

	@BeforeEach
	void setup() {
		coche = new Coche();
	}
	
	@Test
	@DisplayName("Prueba de Constructor con Parametros")
	void testConstructorConParametros() {
		String marca = "Toyota";
		String matricula = "12345ABC";
		String color = "Rojo";
		
		Coche cochePrueba = new Coche(marca, matricula, color);
		
		assertEquals(marca, cochePrueba.getMarca());
		assertEquals(matricula, cochePrueba.getMatricula());
		assertEquals(color, cochePrueba.getColor());
	}

	@Test
	@DisplayName("Prueba de Getter y Setter de ID")
	void testSetAndGetId() {
		Long id = 1L;
		coche.setId(id);
		
		assertEquals(id, coche.getId());
	}

	@Test
	@DisplayName("Prueba de Getter y Setter de Marca")
	void testSetAndGetMarca() {
		String marca = "Toyota";
		coche.setMarca(marca);
		
		assertEquals(marca, coche.getMarca());
	}

	@Test
	void testGetMatricula() {
		fail("Not yet implemented");
	}

	@Test
	void testSetMatricula() {
		fail("Not yet implemented");
	}

	@Test
	void testGetColor() {
		fail("Not yet implemented");
	}

	@Test
	void testSetColor() {
		fail("Not yet implemented");
	}

}
