package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.Editorial;
import com.cibertec.serviceImpl.EditorialServiceImpl;
import com.cibertec.utils.NotFoundException;

@RestController
@RequestMapping("/api/editorial")
public class EditorialController {

	@Autowired
	private EditorialServiceImpl servicio;
	
	@GetMapping
	public ResponseEntity<?> listar(){
		return new ResponseEntity<List<Editorial>>(servicio.listarTodos(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> buscar(@PathVariable Long id){
		Editorial edi = servicio.buscarPorId(id);
		if(edi==null)
			throw new NotFoundException();
		else
			edi=servicio.buscarPorId(id);
			
		return new ResponseEntity<>(edi,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> registar(@RequestBody Editorial bean) {
		Editorial edi = servicio.registrar(bean);
		return new ResponseEntity<Editorial>(edi,HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<?> actualizar(@RequestBody Editorial bean) {
		Editorial edi = servicio.actualizar(bean);
		return new ResponseEntity<Editorial>(edi,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminar(@PathVariable Long id){
		//buscar còdigo
		Editorial edi=servicio.buscarPorId(id);
		//validar
		if(edi==null)
			throw new NotFoundException();
		else
			servicio.eliminarPorId(id);	
		return new ResponseEntity<>(HttpStatus.NO_CONTENT); 
	}
	
}
