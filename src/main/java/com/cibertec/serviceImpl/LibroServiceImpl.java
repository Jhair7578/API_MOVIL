package com.cibertec.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Libro;
import com.cibertec.repository.LibroDAO;

@Service
public class LibroServiceImpl extends ICRUDImpl<Libro, Long>{

	@Autowired
	private LibroDAO repo;
	
	@Override
	public JpaRepository<Libro, Long> getRepository() {
		return repo;
	}

}
