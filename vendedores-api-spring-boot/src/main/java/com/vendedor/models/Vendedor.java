package com.vendedor.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "vendedores")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVendedor;

    @Column(name = "id_usuario")
    private Long idUsuario;

    private String nombreCompleto;
    private String rut;
    private String areaVentas;
}
