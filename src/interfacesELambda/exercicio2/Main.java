package interfacesELambda.exercicio2;

import java.util.Scanner;

public class Main {

    public final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ProductTax food = price -> price * 0.01;
        ProductTax health = price -> price * 0.015;
        ProductTax clothing = price -> price * 0.025;
        ProductTax culture = price -> price * 0.04;

        int option = -1;
        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Alimentação");
            System.out.println("2 - Saúde e bem estar");
            System.out.println("3 - Vestuário");
            System.out.println("4 - Cultura");
            System.out.println("0 - Sair");
            System.out.println("============================");
            option = scanner.nextInt();

            if (option == 0) System.exit(0);

            System.out.print("Informe o preço do produto: ");
            double price = scanner.nextDouble();

            double tax = switch (option) {
                case 1 -> food.calculate(price);
                case 2 -> health.calculate(price);
                case 3 -> clothing.calculate(price);
                case 4 -> culture.calculate(price);
                default -> {
                    System.out.println("Opção inválida.");
                    yield 0;
                }
            };

            System.out.printf("Imposto calculado: R$ %.2f\n", tax);
        } while (true);
    }
}
