package com.curso.curso.resources;

import java.util.ArrayList;
import java.util.List;

import com.curso.curso.domain.Categoria;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
class CategoriaResources {

    @RequestMapping(method=RequestMethod.GET)
    public List<Categoria> listar(){
        Categoria cat1 = new Categoria(1, "informatica");
        Categoria cat2 = new Categoria(1, "Escritorio");

        List<Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);
        
        return lista;
    }

}