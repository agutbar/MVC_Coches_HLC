package com.hlc.coche.controladores;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hlc.coche.entidades.Coche;
import com.hlc.coche.servicios.CocheServicios;

@Controller
@RequestMapping ("/coches")
public class CocheControlador {
	
	private final String VISTA_LISTA = "coches/listar";
	private final String VISTA_FORMULARIO = "coches/formulario";
	
	private CocheServicios servicio;
	
	public CocheControlador (CocheServicios servicio) {
		this.servicio = servicio;
	}
	
	@GetMapping ("/lista")
	public String listar(Model model) {
		List<Coche> coches = servicio.obtenerTodosLosCoches();
		model.addAttribute("coches", coches);
		return VISTA_LISTA;
	}
	
	@GetMapping ("/nuevo")
	public String mostrarFormulario(Model model) {
		model.addAttribute("coche", new Coche());
		return VISTA_FORMULARIO;
	}
}
