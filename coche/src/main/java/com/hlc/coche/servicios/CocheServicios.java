package com.hlc.coche.servicios;

import java.util.List;

import com.hlc.coche.entidades.Coche;

public interface CocheServicios {
	
	List<Coche> obtenerTodosLosCoches();
	Coche obtenerCochePorId(Long id);
	Coche guardadCoche(Coche coche);
	void EliminarCoche (Long id);
}
