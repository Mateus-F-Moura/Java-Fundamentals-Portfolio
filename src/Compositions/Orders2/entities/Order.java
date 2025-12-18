package Compositions.Orders2.entities;

import Compositions.Orders2.application.Main;
import Compositions.Orders2.entities.enums.OrderStatus;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Instant instant;
    private OrderStatus status;
    private Client client;
    private final List<OrderItem> orderItems = new ArrayList<>();

    public Order(Instant instant, OrderStatus status, Client client) {
        this.instant = instant;
        this.status = status;
        this.client = client;
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addItem(OrderItem orderItem) {
        this.orderItems.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        this.orderItems.remove(orderItem);
    }

    public double total() {
        double sum = 0.0;

        for (OrderItem i : orderItems) {
            sum += i.subTotal();
        }

        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ").append(Main.instantFormatter.format(instant)).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append("Client: ").append(client).append("\n");
        sb.append("Order items:\n");
        for (OrderItem item : orderItems) {
            sb.append(item).append("\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
