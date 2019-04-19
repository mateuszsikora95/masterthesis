package com.example.masterthesis;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.Collectors;

@Component
public class RandomFileReader {

    private String rootDirectory = (new ClassPathResource("")).getPath() + "/test";
    private Random random = new Random();

    public String getRandomText() throws IOException {
        long count = Files.walk(Paths.get(rootDirectory)).filter(x -> x.toFile().isFile()).count();
        return String.join("", Files.readAllLines(Files.walk(Paths.get(rootDirectory)).skip(random.nextInt((int) (count - 1))).findFirst().get()));
    }
}
