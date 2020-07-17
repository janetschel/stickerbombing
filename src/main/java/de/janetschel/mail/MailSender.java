package de.janetschel.mail;

import de.janetschel.mail.data.Mail;
import de.janetschel.mail.data.MailAddress;
import lombok.NonNull;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSender {

    public void sendEmailToCompany(@NonNull final MailAddress from, @NonNull final MailAddress to,
                                   @NonNull final String password, @NonNull final String homeAddress) {
        final var mail = new Mail(from, to, homeAddress);
        var properties = System.getProperties();

        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        var session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(mail.getFrom().getEmailAddress(), password);
            }
        });

        try {
            var mimeMessage = new MimeMessage(session);

            mimeMessage.setFrom(new InternetAddress(mail.getFrom().getEmailAddress()));
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(mail.getTo().getEmailAddress()));
            mimeMessage.setSubject(mail.getSubject());
            mimeMessage.setText(mail.getBody());

            Transport.send(mimeMessage);

            System.out.println(String.format("Email erfolgreich verschickt: %s", mail.getTo().getEmailAddress()));

        } catch (MessagingException messagingException) {
            System.out.println(String.format("Fehler beim verschicken der Email: %s\nGrund: %s",
                    mail.getTo().getEmailAddress(), messagingException.getCause().toString()));
        }
    }
}
