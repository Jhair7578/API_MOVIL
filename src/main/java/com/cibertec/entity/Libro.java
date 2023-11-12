package com.cibertec.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    
    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    private Integer anio_publicacion;

    @ManyToOne
    @JoinColumn(name = "editorial_id")
    private Editorial editorial;

    
}