package DateTIme;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pratice {
    public static void main(String[] args) {
            Instant instant = Instant.now();

            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());
            DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss").withZone(ZoneId.systemDefault());
            DateTimeFormatter dateTimeFormat =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

            System.out.println("Date: " + dateFormat.format(instant));
            System.out.println("Time: " + timeFormat.format(instant));
            System.out.println("Date and time: " + dateTimeFormat.format(instant));
            System.out.println("Instant: " + dateTimeFormat.format(instant));
    }
}
