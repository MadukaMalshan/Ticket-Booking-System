package org.example.repository;

import org.example.dto.Theaterdto;
import org.example.entity.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TheaterRepositary extends JpaRepository<TheaterEntity, Long> {


    List<TheaterEntity> findByName(String name);

    List<TheaterEntity> findByLocation(String location);

    List<TheaterEntity> findByCapacity(int capacity);
}
