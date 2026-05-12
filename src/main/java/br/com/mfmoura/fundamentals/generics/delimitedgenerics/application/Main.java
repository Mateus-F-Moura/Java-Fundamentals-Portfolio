package br.com.mfmoura.fundamentals.generics.delimitedgenerics.application;

import br.com.mfmoura.fundamentals.generics.delimitedgenerics.model.entities.Product;
import br.com.mfmoura.fundamentals.generics.delimitedgenerics.model.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> productList = new ArrayList<>();

        String path = "C:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.trim().split(",");

                productList.add(new Product(fields[0], Double.valueOf(fields[1])));

                line = br.readLine();
            }

            Product mostExpensive = CalculationService.max(productList);
            System.out.println("Most expensive: " + mostExpensive);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
