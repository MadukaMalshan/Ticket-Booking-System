package org.example.services;

import org.example.dto.Moviedto;

import java.util.List;

public interface MovieService {
    List<Moviedto> getAllMovies();
    Moviedto getMovieById(Long id);
    void createMovie(Moviedto movie);
    void updateMovie( Moviedto movie);
    void deleteMovie(Long id);
    List<Moviedto> getMoviesByName(String name);
    List<Moviedto> getMoviesByGenre(String genre);
    List<Moviedto> getMoviesByDescription(String description);

}
