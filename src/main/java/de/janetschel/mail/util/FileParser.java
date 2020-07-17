package de.janetschel.mail.util;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Objects;

public class FileParser {
    public String getFileFromResources(String fileName) {
        var resource =  getClass().getClassLoader().getResource(fileName);
        return getContentsFromFile(new File(Objects.requireNonNull(resource).getFile()));
    }

    @SneakyThrows
    private String getContentsFromFile(File file) {
        var stringBuilder = new StringBuilder();

        try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            var line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
        }

        return stringBuilder.toString();
    }
}
