package com.vendedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendedor.models.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
}
