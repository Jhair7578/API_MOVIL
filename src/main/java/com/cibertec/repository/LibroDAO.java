package com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.entity.Libro;

public interface LibroDAO extends JpaRepository<Libro, Long>{

}
