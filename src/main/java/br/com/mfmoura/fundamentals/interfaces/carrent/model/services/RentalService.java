package br.com.mfmoura.fundamentals.interfaces.carrent.model.services;

import br.com.mfmoura.fundamentals.interfaces.carrent.model.entities.CarRental;
import br.com.mfmoura.fundamentals.interfaces.carrent.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    Double pricePerHour;
    Double pricePerDay;

    TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public TaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayment;
        if (hours < 12.0) {
            basicPayment = getPricePerHour() * Math.ceil(hours);
        } else {
            basicPayment = getPricePerDay() * Math.ceil(hours / 24.0);
        }

        double tax = getTaxService().tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
