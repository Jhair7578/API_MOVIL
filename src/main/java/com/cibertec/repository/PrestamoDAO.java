package com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.entity.Prestamo;

public interface PrestamoDAO extends JpaRepository<Prestamo, Long>{

}
