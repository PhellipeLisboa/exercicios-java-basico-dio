package interfacesELambda.exercicio3;

import java.util.Scanner;

public class Main {

    public final static Scanner scanner = new Scanner(System.in);
    public static GeometricShape geometricShape;

    public static void main(String[] args) {


        int option = -1;
        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Criar um quadrado");
            System.out.println("2 - Criar um retângulo");
            System.out.println("3 - Criar um círculo");
            System.out.println("4 - Calcular área");
            System.out.println("0 - Sair");
            System.out.println("============================");
            option = scanner.nextInt();

            switch(option) {
                case 1 -> geometricShape = createSquare();
                case 2 -> geometricShape = createRectangle();
                case 3 -> geometricShape = createCircle();
                case 4 -> calculateArea(geometricShape);
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida.");
            }

        } while (true);

    }

    public static Square createSquare() {
        System.out.println("Informe o lado do quadrado: ");
        double side = scanner.nextDouble();

        Square square = new Square(side);
        System.out.printf("Quadrado de lado %s criado com sucesso.\n", side);
        return square;
    }

    public static Rectangle createRectangle() {
        System.out.println("Informe a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.println("Informe a altura do retângulo: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(base, height);
        System.out.printf("Retângulo de base %s e altura %s criado com sucesso.\n", base, height);
        return rectangle;
    }

    public static Circle createCircle() {
        System.out.println("Informe o raio do círculo: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        System.out.printf("Círculo de raio %s criado com sucesso.\n", radius);
        return circle;
    }


    public static void calculateArea(GeometricShape geometricShape) {

        switch (geometricShape) {
            case Square square -> {
                double area = square.calculateArea();
                System.out.printf("A área do quadrado de lado %s é %s.\n", square.getBase(), area);
            }
            case Rectangle rectangle -> {
                double area = rectangle.calculateArea();
                System.out.printf("A área do retângulo de base %s e altura %s é %s.\n", rectangle.getBase(),
                        rectangle.getHeight(), area);
            }
            case Circle circle -> {
                double area = circle.calculateArea();
                System.out.printf("A área do círculo de raio %s é %s.\n", circle.getRadius(), area);
            }
            default -> throw new IllegalStateException("Forma geométrica inválida: " + geometricShape);
        }

    }

}