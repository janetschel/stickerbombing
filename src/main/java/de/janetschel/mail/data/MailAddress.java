package de.janetschel.mail.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
@Getter
public class MailAddress {
    @NonNull private final String emailAddress;
}
