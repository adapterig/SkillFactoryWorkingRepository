package module9.task9;

public class Parallelogram extends Quadrangle implements Figure {
    double alpha;
    double beta;

    public Parallelogram(int a, int b, double alpha, double beta, String color) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double area() {
        return a * b * Math.sin(Math.toRadians(alpha));
    }

    @Override
    public double perimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public double getLargeDiagonal() {
        return Math.max(Math.sqrt(a * a + b * b + 2 * a * b * Math.cos(Math.toRadians(alpha))),
                Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(alpha))));
    }

    @Override
    public double getHeight() {
        return Math.min(a * Math.sin(Math.toRadians(alpha)), b * Math.sin(Math.toRadians(alpha)));
    }

    @Override
    public String getColor() {
        return color;
    }
}
