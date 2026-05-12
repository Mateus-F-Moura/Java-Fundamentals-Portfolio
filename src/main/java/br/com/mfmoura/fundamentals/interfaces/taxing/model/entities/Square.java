package br.com.mfmoura.fundamentals.interfaces.taxing.model.entities;

import br.com.mfmoura.fundamentals.interfaces.taxing.model.services.Shape;

public class Square implements Shape {
    private Double side;

    public Square(Double side) {
        this.side = side;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(getSide(), 2);
    }
}
