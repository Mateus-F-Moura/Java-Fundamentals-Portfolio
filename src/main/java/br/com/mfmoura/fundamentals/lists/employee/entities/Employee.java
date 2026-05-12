package br.com.mfmoura.fundamentals.lists.employee.entities;

public class Employee {

    private final Integer id;
    private String name;
    private String sector;
    private Double salary;

    public Employee(Integer id, String name, Double salary, String sector) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.sector = sector;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        this.salary += salary * percentage / 100;
    }

    public void decreaseSalary(double percentage) {
        this.salary -= salary * percentage / 100;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}