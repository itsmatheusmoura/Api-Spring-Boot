package com.matheusmoura.cursomc.services;


import com.matheusmoura.cursomc.domain.Cliente;
import com.matheusmoura.cursomc.repositories.ClienteRepository;
import com.matheusmoura.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente buscar(Integer id){
        Cliente obj = repo.findById(id).orElseThrow(
                () -> new ObjectNotFoundException("Objeto não encontrado ! Id: " + id
                        + ", Tipo: " + Cliente.class.getName())
        );

        return obj;
    }
}
