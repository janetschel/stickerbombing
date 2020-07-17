package de.janetschel.mail.config;

import de.janetschel.mail.util.FileParser;
import lombok.Getter;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Getter
public class EmailLoader {
    private final List<String> emails = new ArrayList<>();

    public EmailLoader() {
        var contentFromFile = (new FileParser()).getFileFromResources("emails.json");
        evaluateJson(contentFromFile);
    }

    private void evaluateJson(String contentFromFile) {
        var obj = new JSONObject(contentFromFile);
        var emailsArray = obj.getJSONArray("emails");

        for (var email : emailsArray) {
            emails.add(email.toString());
        }
    }
}
