package com.cibertec.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Autor;
import com.cibertec.repository.AutorDAO;

@Service
public class AutorServiceImpl extends ICRUDImpl<Autor, Long>{

	@Autowired
	private AutorDAO repo;

	@Override
	public JpaRepository<Autor, Long> getRepository() {
		return repo;
	}
	

	

}
