package com.cibertec.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Categoria;
import com.cibertec.repository.CategoriaDAO;

@Service
public class CategoriaServiceImpl extends ICRUDImpl<Categoria, Long>{

	@Autowired
	private CategoriaDAO repo;
	
	@Override
	public JpaRepository<Categoria, Long> getRepository() {
		return repo;
	}

}
