package org.example.repository;

import org.example.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<MovieEntity, Long> {
    List<MovieEntity> findByName(String name);
    List<MovieEntity> findByGenre(String genre);
    List<MovieEntity> findByDescription(String description);
    // Custom query methods can be defined here if needed
    // For example, find movies by name or genre
    // List<MovieEntity> findByName(String name);
    // List<MovieEntity> findByGenre(String genre);
}
