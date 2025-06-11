package com.vendedor.mapper;

import org.springframework.stereotype.Component;

import com.vendedor.dto.VendedorDTO;
import com.vendedor.models.Vendedor;

@Component
public class VendedorMapper {

    public VendedorDTO toDTO(Vendedor vendedor) {
        return VendedorDTO.builder()
                .idVendedor(vendedor.getIdVendedor())
                .idUsuario(vendedor.getIdUsuario())
                .nombreCompleto(vendedor.getNombreCompleto())
                .rut(vendedor.getRut())
                .areaVentas(vendedor.getAreaVentas())
                .build();
    }

    public Vendedor toEntity(VendedorDTO dto) {
        return Vendedor.builder()
                .idVendedor(dto.getIdVendedor())
                .idUsuario(dto.getIdUsuario())
                .nombreCompleto(dto.getNombreCompleto())
                .rut(dto.getRut())
                .areaVentas(dto.getAreaVentas())
                .build();
    }
}
