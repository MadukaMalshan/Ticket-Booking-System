package org.example.dto;

import lombok.*;
import utill.TicketTypes;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Ticketdto {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private TicketTypes ticketTypes;
}
