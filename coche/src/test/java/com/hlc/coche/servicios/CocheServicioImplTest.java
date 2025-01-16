package com.hlc.coche.servicios;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.repository.ListCrudRepository;

import com.hlc.coche.entidades.Coche;
import com.hlc.coche.repositorio.*;

class CocheServicioImplTest {

	@Mock //-> Simulamos el repositorio como Dependencia
	private CocheRepositorio cocheRepositorio;
	
	@InjectMocks //-> Creamos una instancia real de CocheServicioImpl y se inyecta automaticamente el mock de cocheRepositorio en esta clase
	private CocheServicioImpl cocheServicio;
	
	@BeforeEach
	void setup() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	void testObtenerTodosLosCoches() {
		List<Coche> coches = Arrays.asList(
				new Coche ("Toyota", "1234ABC", "Rojo"), 
				new Coche ("Fort", "9876ZYX", "Verde")
				);
		
		when(cocheRepositorio.findAll()).thenReturn(coches);
		
		//Llamar al servicio
		List<Coche> resultado_lista = cocheServicio.obtenerTodosLosCoches();
		Integer resultado_esperado = 2;
		Integer longitud_lista = resultado_lista.size();
		
		assertEquals(resultado_esperado,longitud_lista);
		verify(cocheRepositorio, times(1)).findAll();
	}

}
