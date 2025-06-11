package com.soporte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soporte.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
