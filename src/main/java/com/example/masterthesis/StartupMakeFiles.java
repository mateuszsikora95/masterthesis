package com.example.masterthesis;


import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;

public class StartupMakeFiles  {

    private static String rootDirectory;
    Set<String> directories = Set.of("abashed", "sense", "perfect", "place", "smash",
            "impolite", "pest", "poison", "wrap", "communicate",
            "beautiful", "finicky");
    Set<String> files = Set.of(
            "abashed", "sense", "perfect", "place", "smash",
            "impolite", "pest", "communicate",
            "beautiful", "finicky", "quirky", "puffy", "zipper",
            "command", "clear", "representative", "limping", "gaze",
            "mellow", "burst", "beds", "wall", "rub", "improve",
            "huge", "expand", "fresh", "applaud", "car", "hydrant",
            "encouraging", "point", "stranger", "discussion", "oafish",
            "analyse", "burn", "quiet", "turn", "heat",
            "efficient", "cumbersome", "experience", "things", "gratis",
            "force", "brush", "porter", "produce", "steep", "tidy",
            "actually", "loutish", "passenger", "load", "use", "stupid",
            "rotten", "suffer", "maddening", "zoom", "fluttering",
            "advertisement", "gray", "greet", "harbor", "girl",
            "ethereal", "arrogant", "happy", "describe", "orange",
            "slip", "drab", "craven", "wobble", "food", "unwieldy",
            "muddled", "overwrought", "nasty", "retire",
            "hesitant", "attack", "intelligent", "train",
            "flood" , "end", "reduce", "crackpot", "run", "pasture",
            "crevice", "test", "robot", "hay", "fear", "industry", "article", "modernize",
            "pause", "habit", "faint", "well", "suitcase", "systematic", "steak",
            "reward", "application", "edition", "aid", "leash", "extinct",
            "think", "duke", "charge", "pleasant", "law", "excess", "twin", "still",
            "reproduce", "correction", "wrestle", "answer", "voucher", "way", "battlefield",
            "moral", "dialect", "concert", "restaurant", "archive", "majority",
            "stubborn", "judge", "clearance", "road", "bush", "provoke", "instrument",
            "remedy", "comment", "development", "wine", "rest", "parade", "harsh", "pool",
            "winter", "drum", "feminine", "swing", "elaborate", "council", "bubble", "float",
            "love", "commemorate", "designer", "arrest", "contract", "escape", "slap"
            );
    private String fileContent;


    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        try {
            fileContent = readExampleFile();
            rootDirectory = (new ClassPathResource("")).getPath() + "/test";
            if (!isFileExists()) {
                Files.createDirectory(Paths.get(rootDirectory));
                directories.forEach(name -> {
                            try {
                                makeDirectory(rootDirectory + "/" + name);
                                makeFilesInDirectory(rootDirectory + "/" + name);
                            } catch (IOException e) {

                            }
                        }
                );
            }
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

    private String readExampleFile() throws IOException {
        Resource resource = new ClassPathResource("exampleFile.txt");
        Path file = resource.getFile().toPath();
        return String.join("", Files.readAllLines(file));
    }

    private void makeFilesInDirectory(String name) throws IOException {
        files.forEach(x ->
                {
                    try {
                        Path path = Paths.get(name + "/" + x);
                        if(!path.toFile().exists()) {
                            Files.createFile(path);
                            BufferedWriter bufferedWriter = Files.newBufferedWriter(path);
                            bufferedWriter.write(fileContent);
                            bufferedWriter.flush();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        );
    }

    private void makeDirectory(String name) throws IOException {
        Path dir = Paths.get(name);
        if(!dir.toFile().exists()) {
            Files.createDirectory(dir);
            directories.forEach(x -> {
                try {
                    Files.createDirectory(Paths.get(name + "/" + x));
                    makeFilesInDirectory(name + "/" + x);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
    }

    private boolean isFileExists() throws URISyntaxException {
        return Paths.get(rootDirectory).toFile().exists();
    }
}
