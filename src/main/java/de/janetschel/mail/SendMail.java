package de.janetschel.mail;

import de.janetschel.mail.config.EmailLoader;
import de.janetschel.mail.config.SecretsLoader;
import de.janetschel.mail.data.MailAddress;

public class SendMail {
    private static final SecretsLoader secretsLoader = new SecretsLoader();

    public static void main(String[] args) {
        var mailSender = new MailSender();
        var emails = (new EmailLoader()).getEmails();

        var fromAddress = new MailAddress(secretsLoader.getEmail());
        var password = secretsLoader.getPassword();

        var homeAddress = secretsLoader.getHomeAddress();

        emails.forEach(email -> {
            var toAddress = new MailAddress(email);
            mailSender.sendEmailToCompany(fromAddress, toAddress, password, homeAddress);
        });

        System.out.printf("Emails erfolgreich an %s Email-Adressen verschickt.", emails.size());
    }
}
