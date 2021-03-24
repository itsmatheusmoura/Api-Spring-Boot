package com.matheusmoura.cursomc.repositories;

import com.matheusmoura.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRespository extends JpaRepository<Endereco, Integer> {
}
