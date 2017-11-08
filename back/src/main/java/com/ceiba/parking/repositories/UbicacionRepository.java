package com.ceiba.parking.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.ceiba.parking.entities.Ubicacion;

@Transactional
public interface UbicacionRepository  extends CrudRepository<Ubicacion,Integer>{

}
