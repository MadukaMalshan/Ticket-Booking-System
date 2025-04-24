package org.example.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Theaterdto;
import org.example.entity.TheaterEntity;
import org.example.repository.TheaterRepositary;
import org.example.services.TheaterService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class Theaterimpl implements TheaterService {
    private final ModelMapper modelMapper;
    private final TheaterRepositary theaterRepositary;
    @Override
    public List<TheaterEntity> getAllTheaters() {
        List<TheaterEntity> theaterdtos = new ArrayList<>();
        List<TheaterEntity> theaterEntities = theaterRepositary.findAll();
        theaterEntities.forEach(theaterEntity -> {
            theaterdtos.add(modelMapper.map(theaterEntity, TheaterEntity.class));
        });
        return theaterdtos;
    }

    @Override
    public Theaterdto getTheaterById(Long id) {
        return modelMapper.map(theaterRepositary.findById(id), Theaterdto.class);
    }

    @Override
    public void createTheater(Theaterdto theater) {
        theaterRepositary.save(modelMapper.map(theater, TheaterEntity.class));
    }

    @Override
    public void updateTheater(Theaterdto theater) {
        TheaterEntity theaterEntity = theaterRepositary.findById(theater.getId()).orElseThrow(() -> new RuntimeException("Theater not found"));
        theaterEntity.setName(theater.getName());
        theaterEntity.setLocation(theater.getLocation());
        theaterEntity.setCapacity(theater.getCapacity());
        theaterRepositary.save(theaterEntity);
    }

    @Override
    public void deleteTheater(Long id) {
        theaterRepositary.deleteById(id);
    }

    @Override
    public List<Theaterdto> getTheatersByName(String name) {
        List<Theaterdto> theaterdtos = new ArrayList<>();
        List<TheaterEntity> theaterEntities = theaterRepositary.findByName(name);
        theaterEntities.forEach(theaterEntity -> {
            theaterdtos.add(modelMapper.map(theaterEntity, Theaterdto.class));
        });
        return theaterdtos;
    }

    @Override
    public List<Theaterdto> getTheatersByLocation(String location) {
        List<Theaterdto> theaterdtos = new ArrayList<>();
        List<TheaterEntity> theaterEntities = theaterRepositary.findByLocation(location);
        theaterEntities.forEach(theaterEntity -> {
            theaterdtos.add(modelMapper.map(theaterEntity, Theaterdto.class));
        });
        return theaterdtos;
    }

    @Override
    public List<Theaterdto> getTheatersByCapacity(int capacity) {
        List<Theaterdto> theaterdtos = new ArrayList<>();
        List<TheaterEntity> theaterEntities = theaterRepositary.findByCapacity(capacity);
        theaterEntities.forEach(theaterEntity -> {
            theaterdtos.add(modelMapper.map(theaterEntity, Theaterdto.class));
        });
        return theaterdtos;
    }
}
