package com.envios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.envios.model.Envio;

@Repository
public interface EnvioRepository extends JpaRepository<Envio, Long> {
}
