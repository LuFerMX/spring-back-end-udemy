package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.entity.Curso;
import com.example.repository.CursoJpaRepository;
import com.example.service.ICursoService;

public class CursoServiceImpl implements ICursoService {
	
	@Autowired
	@Qualifier("cursoJpaRepository")
	private CursoJpaRepository cursoJpaRepository;

	@Override
	public List<Curso> listAllCursos() {
		return cursoJpaRepository.findAll();
	}

	@Override
	public Curso addCurso(Curso curso) {
		return cursoJpaRepository.save(curso);
	}

	@Override
	public int removeCurso(int id) {
		cursoJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public Curso updateCurso(Curso curso) {
		return cursoJpaRepository.save(curso);
	}

}
