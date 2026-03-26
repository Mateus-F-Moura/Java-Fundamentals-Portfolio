package Set.logRegistration.application;

import Set.logRegistration.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter file full path: ");
            String path = sc.nextLine();

            try (BufferedReader br = new BufferedReader(new FileReader(path))) {

                Set<LogEntry> logEntries = new HashSet<>();

                String line = br.readLine();
                while (line != null) {

                    String[] fields = line.split(" ");
                    String username = fields[0];
                    Instant instant = Instant.parse(fields[1]);

                    logEntries.add(new LogEntry(username, instant));

                    line = br.readLine();
                }

                System.out.println("Total users: " + logEntries.size());

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        }
    }
}
