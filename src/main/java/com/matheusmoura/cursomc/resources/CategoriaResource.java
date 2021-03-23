package com.matheusmoura.cursomc.resources;

import com.matheusmoura.cursomc.domain.Categoria;
import com.matheusmoura.cursomc.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> listar(@PathVariable Integer id){

        Categoria obj = service.buscar(id);

        return ResponseEntity.ok().body(obj);
    }
}
