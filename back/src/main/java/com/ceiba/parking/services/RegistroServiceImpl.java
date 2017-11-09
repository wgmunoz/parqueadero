package com.ceiba.parking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceiba.parking.entities.Registro;
import com.ceiba.parking.enums.EstadosEnum;
import com.ceiba.parking.repositories.RegistroRepository;

@Service
public class RegistroServiceImpl implements RegistroService{

	@Autowired
	private RegistroRepository registroRepository;
	
	public List<Registro> findAll(){
		return (List<Registro>) registroRepository.findAll();
	}
	
	
	public Registro getRegistroById(Integer idRegistro) {
		return registroRepository.findOne(idRegistro);
	}
	
	
	public Registro saveRegistro(Registro registro) {
		return registroRepository.save(registro);		
	}
	
	
	public void deleteRegistro (Integer idRegistro) {
		registroRepository.delete(idRegistro);
	}

	@Override
	public Registro getRegistroByMatricula(String matricula) {
		Integer estado= EstadosEnum.HABILITADO.isHabilitado();
		return  registroRepository.findRegistroByMatricula(matricula, estado);			
				
	}
	
	public List<Registro> getRegistrosActivos() {	
		Integer estado= EstadosEnum.HABILITADO.isHabilitado();
		return  registroRepository.findRegistrosActivos(estado);			
				
	}
}
