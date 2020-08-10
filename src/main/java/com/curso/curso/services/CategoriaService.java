package com.curso.curso.services;

import java.util.Optional;
import com.curso.curso.domain.Categoria;
import com.curso.curso.repositories.CategoriaRepository;
import com.curso.curso.services.Exception.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
			"Objeto não encontrado! Id" + id + ", Tipo: " + Categoria.class.getName()));
	}
       
}