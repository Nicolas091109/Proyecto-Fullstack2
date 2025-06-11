package com.soporte.controller;

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

import com.soporte.model.TicketDTO;
import com.soporte.service.TicketService;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping
    public List<TicketDTO> listarTickets() {
        return ticketService.obtenerTickets();
    }

    @GetMapping("/{id}")
    public Optional<TicketDTO> obtenerTicket(@PathVariable Long id) {
        return ticketService.obtenerTicketPorId(id);
    }

    @PostMapping
    public TicketDTO crearTicket(@RequestBody TicketDTO dto) {
        return ticketService.guardarTicket(dto);
    }

    @PutMapping("/{id}")
    public TicketDTO actualizarTicket(@PathVariable Long id, @RequestBody TicketDTO dto) {
        return ticketService.actualizarTicket(id, dto);
    }

    @DeleteMapping("/{id}")
    public void eliminarTicket(@PathVariable Long id) {
        ticketService.eliminarTicket(id);
    }
}
