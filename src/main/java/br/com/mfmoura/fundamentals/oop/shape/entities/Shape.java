package br.com.mfmoura.fundamentals.oop.shape.entities;

import br.com.mfmoura.fundamentals.oop.shape.entities.enums.Color;

public abstract class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
