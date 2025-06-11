package com.soporte.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soporte.model.Ticket;
import com.soporte.model.TicketDTO;
import com.soporte.repository.TicketRepository;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<TicketDTO> obtenerTickets() {
        return ticketRepository.findAll().stream()
                .map(this::convertirADTO)
                .collect(Collectors.toList());
    }

    public Optional<TicketDTO> obtenerTicketPorId(Long id) {
        return ticketRepository.findById(id).map(this::convertirADTO);
    }

    public TicketDTO guardarTicket(TicketDTO dto) {
        Ticket ticket = convertirAEntidad(dto);
        return convertirADTO(ticketRepository.save(ticket));
    }

    public TicketDTO actualizarTicket(Long id, TicketDTO dto) {
        Ticket ticket = convertirAEntidad(dto);
        ticket.setId(id);
        return convertirADTO(ticketRepository.save(ticket));
    }

    public void eliminarTicket(Long id) {
        ticketRepository.deleteById(id);
    }

    private TicketDTO convertirADTO(Ticket ticket) {
        return new TicketDTO(
                ticket.getId(),
                ticket.getTitulo(),
                ticket.getDescripcion(),
                ticket.getEstado(),
                ticket.getFechaCreacion(),
                ticket.getIdUsuario()
        );
    }

    private Ticket convertirAEntidad(TicketDTO dto) {
        return new Ticket(
                dto.getId(),
                dto.getTitulo(),
                dto.getDescripcion(),
                dto.getEstado(),
                dto.getFechaCreacion(),
                dto.getIdUsuario()
        );
    }
}
