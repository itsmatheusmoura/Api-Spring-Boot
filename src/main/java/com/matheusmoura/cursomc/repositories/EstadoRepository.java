package com.matheusmoura.cursomc.repositories;

import com.matheusmoura.cursomc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
