package org.example.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.dto.Moviedto;
import org.example.services.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/supplier/movie")
public class MovieController {
    private final MovieService movieService;

    @GetMapping("/get-all")
    public List<Moviedto> getAllMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping("/save")
    public void createMovie(@RequestBody Moviedto movie) {
        movieService.createMovie(movie);
    }

    @GetMapping("/get-by-id/{id}")
    public Moviedto getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
    }
    @PutMapping("/update")
    public void  updateMovie(@RequestBody Moviedto movie) {
        movieService.updateMovie(movie);
    }

}
