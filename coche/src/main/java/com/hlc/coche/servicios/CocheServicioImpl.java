package com.hlc.coche.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hlc.coche.entidades.Coche;
import com.hlc.coche.repositorio.CocheRepositorio;

@Service
public class CocheServicioImpl implements CocheServicios{
	
	private CocheRepositorio cocheRepositorio;
	
	public CocheServicioImpl(CocheRepositorio cocheRepositorio) {
		this.cocheRepositorio = cocheRepositorio;
	}

	@Override
	public List<Coche> obtenerTodosLosCoches() {
		return cocheRepositorio.findAll();
	}

	@Override
	public Coche obtenerCochePorId(Long id) {
		return cocheRepositorio.findById(id).orElseThrow();
	}

	@Override
	public Coche guardadCoche(Coche coche) {
		return cocheRepositorio.save(coche);
	}

	@Override
	public void EliminarCoche(Long id) {
		cocheRepositorio.deleteById(id);	
	}

}
