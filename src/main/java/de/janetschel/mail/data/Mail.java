package de.janetschel.mail.data;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class Mail {
    @NonNull private final MailAddress from;
    @NonNull private final MailAddress to;

    private final String subject = "Sticker-Anfrage für die Homeoffice-Zeit";
    private final String body;

    public Mail(MailAddress from, MailAddress to, String homeAddress) {
        this.from = from;
        this.to = to;

        body =
                "Sehr geehrte Damen und Herren,\n" +
                "sehr geehrtes Social-Media Team,\n\n" +

                "schon seit klein auf bin ich ein großer Fan von Ihrem Unternehmen und vertrete auch noch im Erwachsenenalter Ihre Grundsätze.\n" +
                "Ich bin gerade dabei mein Auto in der Homeoffice-Zeit etwas zu verschönern und wollte deshalb bei Ihnen anfragen, ob es möglich " +
                "ist, einen oder mehrere Sticker von Ihnen zugeschickt zu bekommen.\n\n" +

                "Bitte entschuldigen Sie, falls ich die falsche Email-Adresse ausgewählt habe.. ich habe leider keine bessere gefunden.\n\n" +

                "Über eine Antwort oder gar einen Sticker würde ich mich sehr freuen.\n\n" +

                "Meine Anschrift lautet wie folgt:\n" +
                homeAddress.replace("\\n", "\n") + "\n\n" +

                "Noch einmal vielen Dank im Voraus!\n\n" +

                "Mit freundlichen Grüßen\n" +
                "Jan Etschel";
    }
}
