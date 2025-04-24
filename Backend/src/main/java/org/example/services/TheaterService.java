package org.example.services;

import org.example.dto.Theaterdto;
import org.example.entity.TheaterEntity;

import java.util.List;

public interface TheaterService {
    List<TheaterEntity> getAllTheaters();
    Theaterdto getTheaterById(Long id);
    void createTheater(Theaterdto theater);
    void updateTheater(Theaterdto theater);
    void deleteTheater(Long id);
    List<Theaterdto> getTheatersByName(String name);
    List<Theaterdto> getTheatersByLocation(String location);
    List<Theaterdto> getTheatersByCapacity(int capacity);
}
