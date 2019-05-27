package com.example.masterthesis;

import com.example.masterthesis.entities.Songdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class Controller {


    private SongsRepository songsRepository;

    @Autowired
    public Controller(SongsRepository songsRepository) {
        this.songsRepository = songsRepository;
    }

    @GetMapping(path = "database")
    public List<Songdata> getSongs() {
        return songsRepository.findAll(
                PageRequest.of((new Random()).nextInt(1750), 30)
        ).getContent();
    }

    @GetMapping(path = "databaseAll")
    public List<Songdata> getAllSongs() {
        return songsRepository.findAll();
    }

    @GetMapping(path = "databaseWriteLittle")
    public List<Songdata> writeLittleSongs() {
        return songsRepository.saveAll(generateSongs(30));
    }

    @GetMapping(path = "databaseWriteMuch")
    public List<Songdata> writeMuchSongs() {
        return songsRepository.saveAll(generateSongs(3000));
    }

    private List<Songdata> generateSongs(int numberOfSongs) {
        List<Songdata> songdata = new ArrayList<>();
        for (int i = 0; i < numberOfSongs; i++) {
            songdata.add(new Songdata(generateData(15), generateData(30), generateData(40), generateData(600)));
        }
        return songdata;
    }

    private String generateData(int length) {
        return Stream.generate(() -> (char) (new Random().nextInt(30) + 41)).map(Object::toString).limit(new Random().nextInt(length) + 1).collect(Collectors.joining());
    }

}
