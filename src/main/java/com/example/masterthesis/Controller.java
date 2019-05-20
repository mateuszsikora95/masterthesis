package com.example.masterthesis;

import com.example.masterthesis.entities.Songdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Random;

@RestController
public class Controller {

    private SongsRepository songsRepository;

    @Autowired
    public Controller(SongsRepository songsRepository) {
        this.songsRepository = songsRepository;
    }

    @GetMapping(path = "database")
    public List<Songdata> getCustomers() {
        return songsRepository.findAll(
                PageRequest.of((new Random()).nextInt(1750), 30)
                ).getContent();
    }

}
