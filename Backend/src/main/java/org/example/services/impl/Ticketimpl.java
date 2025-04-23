package org.example.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Ticketdto;
import org.example.entity.TicketEntity;
import org.example.repository.TicketRepository;
import org.example.services.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class Ticketimpl implements TicketService {
    private final ModelMapper modelMapper;
    private final TicketRepository ticketRepository;
    @Override
    public List<Ticketdto> getAllTickets() {
       List<Ticketdto>ticketdtos=new ArrayList<>();
       List<TicketEntity>ticketEntities=ticketRepository.findAll();
       ticketEntities.forEach(TicketEntity->{
           ticketdtos.add(modelMapper.map(TicketEntity,Ticketdto.class));
       });
       return ticketdtos;
    }

    @Override
    public Ticketdto getTicketById(Long id) {
        return modelMapper.map(ticketRepository.findById(id),Ticketdto.class);
    }

    @Override
    public void createTicket(Ticketdto ticketdto) {
        ticketRepository.save(modelMapper.map(ticketdto, TicketEntity.class));

    }

    @Override
    public Ticketdto updateTicket(Long id, Ticketdto ticketdto) {
        return null;
    }

    @Override
    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }

    @Override
    public List<Ticketdto> getTicketsByName(String name) {
        List<Ticketdto> ticketdtos = new ArrayList<>();
        List<TicketEntity> ticketEntities = ticketRepository.findByName(name);
        ticketEntities.forEach(ticketEntity -> {
            ticketdtos.add(modelMapper.map(ticketEntity, Ticketdto.class));
        });
        return ticketdtos;

    }

    @Override
    public List<Ticketdto> getTicketsByType(String type) {
        List<Ticketdto> ticketdtos = new ArrayList<>();
        List<TicketEntity> ticketEntities = ticketRepository.findByName(type);
        ticketEntities.forEach(ticketEntity -> {
            ticketdtos.add(modelMapper.map(ticketEntity, Ticketdto.class));
        });
        return ticketdtos;
    }

    @Override
    public List<Ticketdto> getTicketsByPriceRange(Double minPrice, Double maxPrice) {
        List<Ticketdto> ticketdtos = new ArrayList<>();
        List<TicketEntity> ticketEntities = ticketRepository.findByName("price");
        ticketEntities.forEach(ticketEntity -> {
            ticketdtos.add(modelMapper.map(ticketEntity, Ticketdto.class));
        });
        return ticketdtos;

    }
}
