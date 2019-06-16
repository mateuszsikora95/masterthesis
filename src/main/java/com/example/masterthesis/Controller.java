package com.example.masterthesis;

import com.example.masterthesis.entities.Songdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class Controller {

    private static int numberOfRecords = 0;
    private SongsRepository songsRepository;

    @Autowired
    public Controller(SongsRepository songsRepository) {
        this.songsRepository = songsRepository;
    }

    @GetMapping(path = "database")
    public List<Songdata> getSongs() {
        return songsRepository.findAll(
                PageRequest.of(2, 30)
        ).getContent();
    }

    @GetMapping(path = "databaseAll")
    public List<Songdata> getAllSongs() {
        return songsRepository.findAll();
    }

    @PostMapping(path = "databaseWriteLittle")
    public List<Songdata> writeLittleSongs(@RequestBody List<Songdata> songdata) {
        List<Songdata> song = saveSongData(songdata);
        songsRepository.saveAll(song);
        return song;
    }

    @GetMapping(path = "databaseWriteMuch")
    public List<Songdata> writeMuchSongs(@RequestBody List<Songdata> songdata) {
        List<Songdata> song = saveSongData(songdata);
        songsRepository.saveAll(song);
        return song;
    }

    private List<Songdata> saveSongData(List<Songdata> songdata) {
        for (Songdata songdatum : songdata) {
            songdatum.setArtist(songdatum.getArtist() + numberOfRecords++);
            songdatum.setLink(songdatum.getLink() + numberOfRecords++);
            songdatum.setSong(songdatum.getSong() + numberOfRecords++);
            songdatum.setText(songdatum.getText() + numberOfRecords++);
        }
        return songdata;
    }
}
