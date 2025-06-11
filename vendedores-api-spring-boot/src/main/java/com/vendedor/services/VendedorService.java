package com.vendedor.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendedor.dto.VendedorDTO;
import com.vendedor.mapper.VendedorMapper;
import com.vendedor.models.Vendedor;
import com.vendedor.repository.VendedorRepository;

@Service
public class VendedorService {

    @Autowired
    private VendedorRepository repository;

    @Autowired
    private VendedorMapper mapper;

    public List<VendedorDTO> findAll() {
        return repository.findAll().stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    public VendedorDTO findById(Long id) {
        return repository.findById(id)
                .map(mapper::toDTO)
                .orElse(null);
    }

    public VendedorDTO save(VendedorDTO dto) {
        Vendedor vendedor = mapper.toEntity(dto);
        return mapper.toDTO(repository.save(vendedor));
    }

    public VendedorDTO update(Long id, VendedorDTO dto) {
        if (!repository.existsById(id)) return null;
        Vendedor vendedor = mapper.toEntity(dto);
        vendedor.setIdVendedor(id);
        return mapper.toDTO(repository.save(vendedor));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
