package com.ceiba.parking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ceiba.parking.entities.Registro;
import com.ceiba.parking.services.RegistroService;

@Controller
@CrossOrigin(origins = {"http://localhost:4200"})
public class RegistroController {

	@Autowired
	private RegistroService registroService;
	
	@RequestMapping(value = "/registros", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Registro> listaRegistros(){
		return registroService.findAll();
	}

	@RequestMapping(value = "/registros/activos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Registro> listaRegActivos(){
		return registroService.getRegistrosActivos();
	}
	
	@RequestMapping(value = "/registros/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Registro> getId(@PathVariable("id") Integer id){
		Registro registro = null;
		try {
			registro = registroService.getRegistroById(id); 
			if (registro == null) {
				registro = new Registro();
			}
		} catch (Exception e) {
			return new ResponseEntity<>(registro, HttpStatus.INTERNAL_SERVER_ERROR);
		}			
		return new ResponseEntity<>(registro, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/registros/matricula/{matricula}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Registro> getMatricula(@PathVariable("matricula") String matricula){
		Registro registro = null;
		try {
			registro = registroService.getRegistroByMatricula(matricula); 
			if (registro == null) {
				registro = new Registro();
			}
		} catch (Exception e) {
			return new ResponseEntity<>(registro, HttpStatus.INTERNAL_SERVER_ERROR);
		}			
		return new ResponseEntity<>(registro, HttpStatus.OK);
	}
	
	
	  @RequestMapping(value = "/registros/create", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)	  
	  @ResponseBody	
	  public String create(@RequestBody Registro registro) {
		  String registroId = "";
	    try {	
	    	registroService.saveRegistro(registro);
	    	registroId = String.valueOf(registro.getIdRegistro());
	    }
	    catch (Exception ex) {
	      return "Error creating the registro: " + ex.toString();
	    }
	    return "Registro succesfully created with id = " + registroId;
	  }
	  
	

	@RequestMapping("registro/delete/{id}")
	public String delete(@PathVariable Integer id ) {
		registroService.deleteRegistro(id);
		return "redirect:/registries";
	}
			
}
