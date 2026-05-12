package br.com.mfmoura.fundamentals.interfaces.cinema.model.services;

import br.com.mfmoura.fundamentals.interfaces.cinema.model.entities.Entrance;
import br.com.mfmoura.fundamentals.interfaces.cinema.model.entities.Order;

import java.util.List;

public class OrderService {

    private List<DiscountStrategy> discounts;

    public OrderService(List<DiscountStrategy> discounts) {
        this.discounts = discounts;
    }

    public List<DiscountStrategy> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<DiscountStrategy> discounts) {
        this.discounts = discounts;
    }

    public Double calculateTotal(Order order) {
        if (order == null || order.getEntrances().isEmpty()) {
            return 0.0;
        }

        double total = order.getEntrances().stream()
                .mapToDouble(Entrance::getBaseValue)
                .sum();

        for (DiscountStrategy discount : getDiscounts()) {
            total = discount.applyDiscount(order, total);
        }

        return total;
    }
}
