package com.vendedor.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VendedorDTO {
    private Long idVendedor;
    private Long idUsuario;
    private String nombreCompleto;
    private String rut;
    private String areaVentas;
}
