package com.envios.model;

import java.time.LocalDate;

public class EnvioDTO {

    private Long id;
    private String direccionDestino;
    private LocalDate fechaEnvio;
    private String estado;
    private Long idVenta;

    public EnvioDTO() {}

    public EnvioDTO(Long id, String direccionDestino, LocalDate fechaEnvio, String estado, Long idVenta) {
        this.id = id;
        this.direccionDestino = direccionDestino;
        this.fechaEnvio = fechaEnvio;
        this.estado = estado;
        this.idVenta = idVenta;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDireccionDestino() { return direccionDestino; }
    public void setDireccionDestino(String direccionDestino) { this.direccionDestino = direccionDestino; }

    public LocalDate getFechaEnvio() { return fechaEnvio; }
    public void setFechaEnvio(LocalDate fechaEnvio) { this.fechaEnvio = fechaEnvio; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Long getIdVenta() { return idVenta; }
    public void setIdVenta(Long idVenta) { this.idVenta = idVenta; }
}
