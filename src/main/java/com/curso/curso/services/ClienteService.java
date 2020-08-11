package com.curso.curso.services;

import java.util.Optional;
import com.curso.curso.domain.Cliente;
import com.curso.curso.repositories.ClienteRepository;
import com.curso.curso.services.Exception.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
			"Objeto não encontrado! Id" + id + ", Tipo: " + Cliente.class.getName()));
	}
       
}