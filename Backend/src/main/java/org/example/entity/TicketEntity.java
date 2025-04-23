package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;
import utill.TicketTypes;
@Data
@Entity
@Table(name = "ticket")
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    @Enumerated(EnumType.STRING)
    private TicketTypes ticketTypes;
}
