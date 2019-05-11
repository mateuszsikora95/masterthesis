package com.example.masterthesis;

import com.example.masterthesis.entities.Songdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class Controller {

    private SongsRepository songsRepository;
    private RandomFileReader randomFileReader;

    @Autowired
    public Controller(SongsRepository songsRepository, RandomFileReader randomFileReader) {
        this.songsRepository = songsRepository;
        this.randomFileReader = randomFileReader;
    }

    @GetMapping(path = "database")
    public List<Songdata> getCustomers() {
        return songsRepository.findAll();
    }

    @GetMapping(path = "file")
    public String getText() throws IOException {
        return randomFileReader.getRandomText();
    }
}
