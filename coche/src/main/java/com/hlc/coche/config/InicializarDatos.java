package com.hlc.coche.config;

import org.springframework.stereotype.Component;

import com.hlc.coche.entidades.Coche;
import com.hlc.coche.repositorio.CocheRepositorio;

import jakarta.annotation.PostConstruct;

@Component
public class InicializarDatos {
	
	private CocheRepositorio cocheRepositorio;
	
	public InicializarDatos(CocheRepositorio cocheRepositorio) {
		this.cocheRepositorio = cocheRepositorio;
	}
	
	@PostConstruct
	public void init() {
		Coche coche1 = new Coche ("Toyota", "12345ABC", "Rojo");
		Coche coche2 = new Coche ("Fort", "98765ZYX", "Verde");
		Coche coche3 = new Coche ("Honda", "19283AZL", "Negro");
		
		cocheRepositorio.save(coche1);
		cocheRepositorio.save(coche2);
		cocheRepositorio.save(coche3);
	}
}
