package com.hlc.coche.controladores;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.hlc.coche.entidades.Coche;
import com.hlc.coche.servicios.CocheServicios;

@WebMvcTest(CocheControlador.class)
class CocheControladorTest {
	
	@Autowired
	private MockMvc mockmvc;
	
	@MockitoBean
	private CocheServicios servicio;

	@Test
	@DisplayName("Debe listar todos los coches y mostrar la vista correcta")
	void listarCoches() throws Exception {
		when(servicio.obtenerTodosLosCoches()).thenReturn(
				Arrays.asList(
						new Coche ("Toyota", "1234ABC", "Rojo"),
						new Coche ("Fort", "9876ZYX", "Verde"),
						new Coche ("Honda", "1928AZL", "Negro")
						)
				
						);
				mockmvc.perform(get("/coches")).andExpect(status().isOk())
				.andExpect(view().name("coches/listar"))
				.andExpect(model().attributeExists("coches"));
	}

}
