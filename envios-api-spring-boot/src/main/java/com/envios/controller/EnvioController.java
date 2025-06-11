package com.envios.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.envios.model.EnvioDTO;
import com.envios.service.EnvioService;

@RestController
@RequestMapping("api/envios")
public class EnvioController {

    @Autowired
    private EnvioService envioService;

    @GetMapping
    public List<EnvioDTO> listarEnvios() {
        return envioService.obtenerEnvios();
    }

    @GetMapping("/{id}")
    public Optional<EnvioDTO> obtenerEnvio(@PathVariable Long id) {
        return envioService.obtenerEnvioPorId(id);
    }

    @PostMapping
    public EnvioDTO crearEnvio(@RequestBody EnvioDTO dto) {
        return envioService.guardarEnvio(dto);
    }

    @PutMapping("/{id}")
    public EnvioDTO actualizarEnvio(@PathVariable Long id, @RequestBody EnvioDTO dto) {
        return envioService.actualizarEnvio(id, dto);
    }

    @DeleteMapping("/{id}")
    public void eliminarEnvio(@PathVariable Long id) {
        envioService.eliminarEnvio(id);
    }
}
