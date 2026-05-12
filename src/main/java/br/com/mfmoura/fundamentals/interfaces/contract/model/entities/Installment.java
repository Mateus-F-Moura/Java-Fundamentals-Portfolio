package br.com.mfmoura.fundamentals.interfaces.contract.model.entities;

import br.com.mfmoura.fundamentals.interfaces.contract.application.Main;

import java.time.LocalDate;

public class Installment {
    private LocalDate dueDate;
    private Double amount;

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return Main.fmt.format(getDueDate()) + " - " + String.format("%.2f%n", getAmount());
    }
}
