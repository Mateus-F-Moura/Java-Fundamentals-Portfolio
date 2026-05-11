package FunctionalAndLambda.StreamPratice.application;

import FunctionalAndLambda.StreamPratice.model.entities.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter full file path: ");
            String path = sc.nextLine();

            try (BufferedReader br = new BufferedReader(new FileReader(path))) {

                List<Product> list = new ArrayList<>();

                String line = br.readLine();

                while (line != null) {
                    String[] fields = line.split(",");

                    list.add(new Product(fields[0], Double.parseDouble(fields[1])));

                    line = br.readLine();
                }

                double avg = list.stream()
                        .map(Product::getPrice)
                        .reduce(0.0, Double::sum) / list.size();

                System.out.printf("Average price: %.2f%n", avg);

                List<String> names = list.stream()
                        .filter(p -> p.getPrice() < avg)
                        .map(Product::getName)
                        .sorted().toList().reversed();

                names.forEach(System.out::println);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
