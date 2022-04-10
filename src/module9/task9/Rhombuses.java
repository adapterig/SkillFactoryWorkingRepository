package module9.task9;

public class Rhombuses extends Quadrangle implements Figure {
    double alpha;
    double beta;

    public Rhombuses(int a,  double alpha, double beta, String color) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double area() {
        return a*a*Math.sin(Math.toRadians(alpha));
    }

    @Override
    public double perimeter() {
        return 4*a;
    }

    @Override
    public double getLargeDiagonal() {
        return Math.max(2 * a * Math.sin(Math.toRadians(alpha / 2)), 2 * a * Math.cos(Math.toRadians(alpha / 2)));
    }

    @Override
    public double getHeight() {
        return a * Math.sin(Math.toRadians(alpha));
    }

    @Override
    public String getColor() {
        return color;
    }
}
