package br.com.mfmoura.fundamentals.interfaces.carrent.model.services;

public class BrazilTaxService implements TaxService{
    @Override
    public Double tax(Double amount) {
        if (amount < 100.00) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }
}
