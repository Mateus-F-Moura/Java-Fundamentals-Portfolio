package br.com.mfmoura.fundamentals.interfaces.taxing.model.entities;

import br.com.mfmoura.fundamentals.interfaces.taxing.model.services.Shape;

public class Circle implements Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
