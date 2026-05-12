package br.com.mfmoura.fundamentals.interfaces.carrent.model.entities;

public class Invoice {
    Double basicPayment;
    Double tax;
    Double totalPayment;

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
        setTotalPayment();
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment() {
        totalPayment = getBasicPayment() + getTax();
    }
}
