package interfacesELambda.exercicio3;

public class Rectangle implements GeometricShape{

    protected double height;
    protected double base;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }
}
