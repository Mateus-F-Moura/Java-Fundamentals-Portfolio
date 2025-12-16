package Enums.Workers.entities;

import Enums.Workers.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public List<HourContract> findContractByDate(Integer month, Integer year) {
        List<HourContract> result = new ArrayList<>();

        for (HourContract c : contracts) {
            if (c.getDate() != null && c.getDate().getMonthValue() == month&& c.getDate().getYear() == year) {
                result.add(c);
            }
        }

        return result;
    }

    public Double income(List<HourContract> contracts) {
        double sum = 0.0;

        for (HourContract c : contracts) {
            sum += c.totalValue();
        }

        return sum + baseSalary;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n"
                + "Level: " + level + "\n"
                + "Department: " + department.getName();
    }
}
