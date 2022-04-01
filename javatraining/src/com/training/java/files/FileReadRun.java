package com.training.java.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.training.java.constructor.Person;

public class FileReadRun {

    public static void main(final String[] args) {
        Map<String, Person> personMap = new HashMap<>();

        Path filePath = Paths.get("file1.txt");
        try {
            List<String> readAllLinesLoc = Files.readAllLines(filePath);
            for (String stringLoc : readAllLinesLoc) {
                String[] splitLoc = stringLoc.split(",");
                if (splitLoc.length == 4) {
                    Person personLoc = new Person();
                    personLoc.setName(splitLoc[0]);
                    personLoc.setSurname(splitLoc[1]);
                    personLoc.setHeight(Integer.parseInt(splitLoc[2]));
                    personLoc.setWeight(Integer.parseInt(splitLoc[3]));
                    personMap.put(personLoc.getName() + "-" + personLoc.getSurname(),
                                  personLoc);
                }
            }
            System.out.println(personMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
