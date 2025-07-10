package interfacesELambda.exercicio3;

public class Square extends Rectangle implements GeometricShape {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double calculateArea() {
        return base * height;
    }
}
