package br.com.mfmoura.fundamentals.sequentially;

import java.util.Scanner;
import java.util.Locale;

public class EmployeeSalary {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id, hrs;
        double v, salary;

        System.out.print("Enter worker ID : ");
        id = sc.nextInt();
        System.out.print("Enter hours of work : ");
        hrs = sc.nextInt();
        System.out.print("Enter value of a hour : ");
        v = sc.nextDouble();

        salary = (v * hrs);

        System.out.println("ID : " + id);
        System.out.println("Salary : " + salary);

        sc.close();
    }
}
