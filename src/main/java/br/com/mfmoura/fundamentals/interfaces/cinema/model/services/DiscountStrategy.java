package br.com.mfmoura.fundamentals.interfaces.cinema.model.services;

import br.com.mfmoura.fundamentals.interfaces.cinema.model.entities.Order;

public interface DiscountStrategy {
    Double applyDiscount(Order order, double currentTotal);
}
