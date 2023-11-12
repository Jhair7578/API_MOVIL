package com.cibertec.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Usuario;
import com.cibertec.repository.UsuarioDAO;

@Service
public class UsuarioServiceImpl extends ICRUDImpl<Usuario, Long>{

	@Autowired
	private UsuarioDAO repo; 
	
	@Override
	public JpaRepository<Usuario, Long> getRepository() {
		return repo;
	}

}
