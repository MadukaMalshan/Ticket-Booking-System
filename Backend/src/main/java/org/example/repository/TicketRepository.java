package org.example.repository;

import org.example.entity.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<TicketEntity, Long> {
    List<TicketEntity> findByName(String name);
    // Custom query methods can be defined here if needed
    // For example, find tickets by name or type
    // List<TicketEntity> findByName(String name);
    // List<TicketEntity> findByTicketTypes(TicketTypes ticketTypes);
}
