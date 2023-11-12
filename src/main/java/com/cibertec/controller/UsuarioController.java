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

import com.cibertec.entity.Usuario;
import com.cibertec.serviceImpl.UsuarioServiceImpl;
import com.cibertec.utils.NotFoundException;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioServiceImpl servicio;
	
	@GetMapping
	public ResponseEntity<?> listar(){
		return new ResponseEntity<List<Usuario>>(servicio.listarTodos(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> buscar(@PathVariable Long id){
		Usuario edi = servicio.buscarPorId(id);
		if(edi==null)
			throw new NotFoundException();
		else
			edi=servicio.buscarPorId(id);
			
		return new ResponseEntity<>(edi,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> registar(@RequestBody Usuario bean) {
		Usuario edi = servicio.registrar(bean);
		return new ResponseEntity<Usuario>(edi,HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<?> actualizar(@RequestBody Usuario bean) {
		Usuario edi = servicio.actualizar(bean);
		return new ResponseEntity<Usuario>(edi,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminar(@PathVariable Long id){
		//buscar còdigo
		Usuario edi=servicio.buscarPorId(id);
		//validar
		if(edi==null)
			throw new NotFoundException();
		else
			servicio.eliminarPorId(id);	
		return new ResponseEntity<>(HttpStatus.NO_CONTENT); 
	}
	
}
