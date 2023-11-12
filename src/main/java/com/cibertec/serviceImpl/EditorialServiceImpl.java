package com.cibertec.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Editorial;
import com.cibertec.repository.EditorialDAO;

@Service
public class EditorialServiceImpl extends ICRUDImpl<Editorial, Long>{

	@Autowired
	private EditorialDAO repo;
	
	@Override
	public JpaRepository<Editorial, Long> getRepository() {
		return repo;
	}

}
