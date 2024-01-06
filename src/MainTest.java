import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    String dataString = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));

    @Test
    void dataEquals() {
        assertEquals("1 marzo 2023", dataString);

    }
}