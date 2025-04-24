package org.example.services;

import org.example.dto.Ticketdto;

import java.util.List;

public interface TicketService {

    List<Ticketdto> getAllTickets();
    Ticketdto getTicketById(Long id);
    void createTicket(Ticketdto ticketdto);
    void updateTicket( Ticketdto ticketdto);
    void deleteTicket(Long id);
    List<Ticketdto> getTicketsByName(String name);
    List<Ticketdto> getTicketsByType(String type);
    List<Ticketdto> getTicketsByPriceRange(Double minPrice, Double maxPrice);

}
