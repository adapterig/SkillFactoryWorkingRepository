package module9.task9;

public class Rectangle extends Quadrangle implements Figure {
    public Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
    public double getLargeDiagonal() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    public double getHeight() {
        return Math.min(a, b);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2 * a + 2 * b;
    }
}
