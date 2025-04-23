package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Ticketdto;
import org.example.services.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/supplier/ticket")
public class TicketController {
    private final TicketService ticketService;

    @GetMapping("/get-all")
    public List<Ticketdto> getAllTickets() {
        return ticketService.getAllTickets();
    }
    @PostMapping("/save")
    public void createTicket(@RequestBody Ticketdto ticketdto){
        ticketService.createTicket(ticketdto);
    }

    @GetMapping("/get-by-id/{id}")
    public Ticketdto getTicketById(@PathVariable Long id){
        return ticketService.getTicketById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTicket(@PathVariable Long id){
        ticketService.deleteTicket(id);
    }





}
