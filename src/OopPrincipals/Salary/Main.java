package OopPrincipals.Salary;

import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("== Salary ==");
            System.out.println();

            Salary salary = new Salary();

            System.out.print("Name:");
            salary.name = sc.nextLine();
            System.out.print("Gross salary: ");
            salary.grossSalary = sc.nextDouble();
            System.out.print("Tax:");
            salary.tax = sc.nextDouble();

            System.out.println();
            System.out.println(salary);
            System.out.println();

            System.out.print("Witch percentage to increase salary? ");
            double percentage = sc.nextDouble();

            salary.increaseSalary(percentage);

            System.out.println(salary);

        }
    }
}