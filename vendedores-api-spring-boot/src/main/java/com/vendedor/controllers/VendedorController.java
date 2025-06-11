package com.vendedor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendedor.dto.VendedorDTO;
import com.vendedor.services.VendedorService;

@RestController
@RequestMapping("/api/proxy/vendedores")
public class VendedorController {

    @Autowired
    private VendedorService service;

    @GetMapping
    public List<VendedorDTO> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public VendedorDTO getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public VendedorDTO create(@RequestBody VendedorDTO dto) {
        return service.save(dto);
    }

    @PutMapping("/{id}")
    public VendedorDTO update(@PathVariable Long id, @RequestBody VendedorDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
