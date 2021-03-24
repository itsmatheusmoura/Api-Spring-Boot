package com.matheusmoura.cursomc.services;

import com.matheusmoura.cursomc.domain.Categoria;
import com.matheusmoura.cursomc.repositories.CategoriaRepository;
import com.matheusmoura.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id){
        Categoria obj = repo.findById(id).orElseThrow(
                () -> new ObjectNotFoundException("Objeto não encontrado ! Id: " + id
                        + ", Tipo: " + Categoria.class.getName())
        );

        return obj;
    }
}
