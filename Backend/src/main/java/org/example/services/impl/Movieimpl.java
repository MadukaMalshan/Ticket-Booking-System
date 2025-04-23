package org.example.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Moviedto;
import org.example.entity.MovieEntity;
import org.example.repository.MovieRepository;
import org.example.services.MovieService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Service
public class Movieimpl implements MovieService {
    private final ModelMapper modelMapper;
    private final MovieRepository movieRepository;
    @Override
    public List<Moviedto> getAllMovies() {
        List<Moviedto> moviedtos = new ArrayList<>();
        List<MovieEntity> movieEntities = movieRepository.findAll();
        movieEntities.forEach(movieEntity -> {
            moviedtos.add(modelMapper.map(movieEntity, Moviedto.class));
        });
        return moviedtos;
    }

    @Override
    public Moviedto getMovieById(Long id) {
        return modelMapper.map(movieRepository.findById(id), Moviedto.class);
    }

    @Override
    public void createMovie(Moviedto movie) {
        movieRepository.save(modelMapper.map(movie, MovieEntity.class));
    }

    @Override
    public Moviedto updateMovie(Long id, Moviedto movie) {
        return null;
    }

    @Override
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }

    @Override
    public List<Moviedto> getMoviesByName(String name) {
        List<Moviedto> moviedtos = new ArrayList<>();
        List<MovieEntity> movieEntities = movieRepository.findByName(name);
        movieEntities.forEach(movieEntity -> {
            moviedtos.add(modelMapper.map(movieEntity, Moviedto.class));
        });
        return moviedtos;
    }

    @Override
    public List<Moviedto> getMoviesByGenre(String genre) {
        List<Moviedto> moviedtos = new ArrayList<>();
        List<MovieEntity> movieEntities = movieRepository.findByGenre(genre);
        movieEntities.forEach(movieEntity -> {
            moviedtos.add(modelMapper.map(movieEntity, Moviedto.class));
        });
        return moviedtos;
    }

    @Override
    public List<Moviedto> getMoviesByDescription(String description) {
        List<Moviedto> moviedtos = new ArrayList<>();
        List<MovieEntity> movieEntities = movieRepository.findByDescription(description);
        movieEntities.forEach(movieEntity -> {
            moviedtos.add(modelMapper.map(movieEntity, Moviedto.class));
        });
        return moviedtos;
    }
}
