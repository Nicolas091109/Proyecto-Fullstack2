package com.envios.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.envios.model.Envio;
import com.envios.model.EnvioDTO;
import com.envios.repository.EnvioRepository;

@Service
public class EnvioService {

    @Autowired
    private EnvioRepository envioRepository;

    public List<EnvioDTO> obtenerEnvios() {
        return envioRepository.findAll().stream()
                .map(this::convertirADTO)
                .collect(Collectors.toList());
    }

    public Optional<EnvioDTO> obtenerEnvioPorId(Long id) {
        return envioRepository.findById(id).map(this::convertirADTO);
    }

    public EnvioDTO guardarEnvio(EnvioDTO dto) {
        Envio envio = convertirAEntidad(dto);
        return convertirADTO(envioRepository.save(envio));
    }

    public EnvioDTO actualizarEnvio(Long id, EnvioDTO dto) {
        Envio envio = convertirAEntidad(dto);
        envio.setId(id);
        return convertirADTO(envioRepository.save(envio));
    }

    public void eliminarEnvio(Long id) {
        envioRepository.deleteById(id);
    }

    private EnvioDTO convertirADTO(Envio envio) {
        return new EnvioDTO(
                envio.getId(),
                envio.getDireccionDestino(),
                envio.getFechaEnvio(),
                envio.getEstado(),
                envio.getIdVenta()
        );
    }

    private Envio convertirAEntidad(EnvioDTO dto) {
        return new Envio(
                dto.getId(),
                dto.getDireccionDestino(),
                dto.getFechaEnvio(),
                dto.getEstado(),
                dto.getIdVenta()
        );
    }
}
