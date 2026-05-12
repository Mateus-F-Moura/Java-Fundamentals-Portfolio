package br.com.mfmoura.fundamentals.interfaces.contract.application;

import br.com.mfmoura.fundamentals.interfaces.contract.model.entities.Contract;
import br.com.mfmoura.fundamentals.interfaces.contract.model.entities.Installment;
import br.com.mfmoura.fundamentals.interfaces.contract.model.services.ContractService;
import br.com.mfmoura.fundamentals.interfaces.contract.model.services.OnlinePaymentService;
import br.com.mfmoura.fundamentals.interfaces.contract.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter contract data:");

            System.out.print("Number: ");
            int number = sc.nextInt();

            System.out.print("Date (dd/MM/yyyy): ");
            sc.nextLine();
            LocalDate date = LocalDate.parse(sc.nextLine(), fmt);

            System.out.print("Contract value: ");
            double totalValue = sc.nextDouble();

            System.out.print("Number of installments: ");
            int months = sc.nextInt();

            Contract contract = new Contract(number, date, totalValue);

            new ContractService(new PaypalService()).processContract(contract, months);

            System.out.println();
            System.out.println("Installments:");
            for (Installment i : contract.getInstallments()) {
                System.out.println(i);
            }

        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
