package OopPrincipals.Rectangle;

public class Rectangle {

    public double width;
    public double height;

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width * 2.0) + (height * 2.0);
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0));
    }

    public String toString() {
        return "Rectangle: Area = " + String.format("%.2f", getArea())
                + " | Perimeter = " + String.format("%.2f", getPerimeter())
                + " | Diagonal = " + String.format("%.2f", getDiagonal());
    }

}
