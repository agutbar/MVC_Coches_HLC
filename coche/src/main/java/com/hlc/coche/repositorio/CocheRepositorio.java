package com.hlc.coche.repositorio;

import org.springframework.data.repository.reactive.RxJava3CrudRepository;
import org.springframework.stereotype.Repository;

import com.hlc.coche.entidades.Coche;

@Repository
public interface CocheRepositorio  extends RxJava3CrudRepository<Coche, Long>{

	
}
