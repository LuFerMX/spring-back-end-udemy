package com.example.service;

import java.util.List;

import com.example.entity.Curso;

public interface ICursoService {

	public abstract List<Curso> listAllCursos();
	public abstract Curso addCurso(Curso curso);
	public abstract int removeCurso(int id);
	public abstract Curso updateCurso(Curso curso);
	
	
}
