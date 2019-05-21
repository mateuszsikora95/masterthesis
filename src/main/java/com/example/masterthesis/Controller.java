package com.example.masterthesis;

import com.example.masterthesis.entities.Songdata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@RestController
public class Controller {

    Logger logger = LoggerFactory.getLogger(Controller.class);

    private SongsRepository songsRepository;

    @Autowired
    public Controller(SongsRepository songsRepository) {
        this.songsRepository = songsRepository;
    }

    @GetMapping(path = "database")
    public List<Songdata> getCustomers() {
        logger.debug(LocalDateTime.now().toString());
        List<Songdata> content = songsRepository.findAll(
                PageRequest.of((new Random()).nextInt(1750), 30)
        ).getContent();
        logger.debug(LocalDateTime.now().toString());
        return content;
    }

}
