package com.example.masterthesis;

import com.example.masterthesis.entities.Customer;
import com.example.masterthesis.entities.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Random;

@RestController
public class Controller {

    private LineItemRepository lineItemRepository;
    private RandomFileReader randomFileReader;

    @Autowired
    public Controller(LineItemRepository lineItemRepository, RandomFileReader randomFileReader) {
        this.lineItemRepository = lineItemRepository;
        this.randomFileReader = randomFileReader;
    }

    @GetMapping(path = "database")
    public Page<Orders> getCustomers() {
        return lineItemRepository.findAll(PageRequest.of((new Random()).nextInt((int) (lineItemRepository.count() - 1)) + 1, 1));
    }

    @GetMapping(path = "file")
    public String getText() throws IOException {
        return randomFileReader.getRandomText();
    }
}
