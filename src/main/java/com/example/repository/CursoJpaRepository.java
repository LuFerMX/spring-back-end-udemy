package com.example.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Curso;

@Repository("cursoJpaRepository")
public interface CursoJpaRepository extends JpaRepository<Curso, Serializable>{

	public abstract Curso findByPrecio(int precio);
	
	public abstract Curso findByPrecioAndNombre(int precio, String nombre);
	
	public abstract List<Curso> findByNombreOrderByHoras(String nombre);

	public abstract Curso findByNombreOrPrecio(String nombre, int precio);
	
}
