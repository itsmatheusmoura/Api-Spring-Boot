package com.matheusmoura.cursomc.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaResource {

    @GetMapping
    public String listar(){
        return "Ola mundo";
    }
}
