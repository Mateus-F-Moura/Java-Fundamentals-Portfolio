package br.com.mfmoura.fundamentals.files.items.application;

import br.com.mfmoura.fundamentals.files.items.model.entities.Item;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("Running in: " + System.getProperty("user.dir"));

        try (Scanner sc = new Scanner(System.in)) {

            String sourceFolderStr = "temp";

            File path = new File(sourceFolderStr);
            if (!path.exists()) {
                boolean success = path.mkdirs();
                if (success) {
                    System.out.println("Directory created: " + path.getAbsolutePath());
                } else {
                    System.out.println("Failed to create directory!");
                }
            }
            
            System.out.print("How many itens to add? ");
            int limit = sc.nextInt();
            sc.nextLine();

            String inPath = sourceFolderStr + File.separator + "in.csv";

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(inPath))) {
                for (int i = 0; i < limit; i++) {
                    bw.write(sc.nextLine());
                    bw.newLine();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

            List<Item> items = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(inPath))) {
                String line = br.readLine();
                while (line != null) {
                    String[] itemData = line.split(",");

                    String name = itemData[0].trim();
                    double price = Double.parseDouble(itemData[1].trim());
                    int quantity = Integer.parseInt(itemData[2].trim());

                    Item item = new Item(name, price, quantity);
                    items.add(item);

                    line = br.readLine();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

            String outPath = sourceFolderStr + File.separator + "out.csv";

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))) {
                for (Item i : items) {
                    bw.write(i.toString());
                    bw.newLine();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
