import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        //Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        //Formatta la data ottenendo 01 marzo 2023
        String dataString = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        //Stampa sulla console - Crea dei test per questo esercizio
        System.out.println("Data 01 marzo 2023: " + dataString);
    }
}