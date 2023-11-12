package com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.entity.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Long>{

}
