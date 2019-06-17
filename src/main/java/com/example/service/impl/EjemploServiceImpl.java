package com.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.model.Persona;
import com.example.service.IEjemploService;

@Service("ejemploService")
public class EjemploServiceImpl implements IEjemploService {
	
	private static final Logger LOG = LoggerFactory.getLogger(EjemploServiceImpl.class);

	@Override
	public List<Persona> getListPersona() {
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona("Juan", 25));
		personas.add(new Persona("Pedro", 43));
		personas.add(new Persona("Ramiro", 18));
		personas.add(new Persona("Josefina", 31));
		personas.add(new Persona("eva", 25));
		LOG.info("SERVICIO");
		return personas;
	}


}
