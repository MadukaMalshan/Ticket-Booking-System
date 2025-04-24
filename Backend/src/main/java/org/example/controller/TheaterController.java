package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Theaterdto;
import org.example.entity.TheaterEntity;
import org.example.services.TheaterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/supplier/theater")
public class TheaterController {
    private final TheaterService theaterService;

    @GetMapping("/get-all")
    public List<TheaterEntity> getAllTheaters() {
        return theaterService.getAllTheaters();
    }

    @PostMapping("/save")
    public void createTheater(@RequestBody Theaterdto theater) {
        theaterService.createTheater(theater);
    }

    @GetMapping("/get-by-id/{id}")
    public Theaterdto getTheaterById(@PathVariable Long id) {
        return theaterService.getTheaterById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTheater(@PathVariable Long id) {
        theaterService.deleteTheater(id);
    }

    @PutMapping("/update")
    public void updateTheater(@RequestBody Theaterdto theater) {
        theaterService.updateTheater(theater);
    }
}
