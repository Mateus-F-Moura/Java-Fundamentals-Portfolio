package OopPrincipals.Salary;

public class Salary {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        percentage /= 100;

        grossSalary *= (percentage + 1);
    }

    public String toString() {
        return "Employee data: " + name + ", " + String.format("%.2f", netSalary());
    }

}