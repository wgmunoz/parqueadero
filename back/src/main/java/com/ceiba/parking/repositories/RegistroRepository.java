package com.ceiba.parking.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.ceiba.parking.entities.Registro;

@Transactional
public interface RegistroRepository extends CrudRepository<Registro, Integer> {

}
