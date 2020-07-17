package de.janetschel.mail.config;

import de.janetschel.mail.util.FileParser;
import lombok.Getter;

@Getter
public class SecretsLoader {
    private String email;
    private String password;
    private String homeAddress;

    public SecretsLoader() {
        var contentFromFile = (new FileParser()).getFileFromResources("application.yaml");
        evaluateContentFromFile(contentFromFile);
    }

    private void evaluateContentFromFile(String content) {
        String[] contentSplit = content.split(" ");
        email = contentSplit[3].replace("\"", "");
        password = contentSplit[6].replace("\"", "");
        homeAddress = contentSplit[9].replace("\"", "").replace("+", " ");
    }
}
