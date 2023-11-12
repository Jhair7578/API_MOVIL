package com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.entity.Categoria;

public interface CategoriaDAO extends JpaRepository<Categoria, Long>{

}
