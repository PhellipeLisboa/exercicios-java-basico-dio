package classesEEncapsulamento.exercicio2;

import java.util.Scanner;

public class Main {

    public final static Scanner scanner = new Scanner(System.in);
    public static Car car = new Car();

    public static void main(String[] args) {

        var option = -1;
        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Reduzir velocidade");
            System.out.println("5 - Virar para esquerda/direita");
            System.out.println("6 - Verificar velocidade");
            System.out.println("7 - Trocar a marcha");
            System.out.println("0 - Sair");
            System.out.println("============================");
            option = scanner.nextInt();

            switch(option) {
                case 1 -> car.turnOn();
                case 2 -> car.turnOff();
                case 3 -> car.accelerate();
                case 4 -> car.decelerate();
                case 5 -> turn();
                case 6 -> car.checkSpeed();
                case 7 -> changeGear();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida.");
            }

        } while (option != 0);

    }

    public static void test() {
        return;
    }

    public static void turn() {
        System.out.println("Para qual direção você deseja virar? \n 0 -> direita \n 1 -> esquerda");
        int option = scanner.nextInt();
        String direction = option == 0 ? "direita" : "esquerda";
        car.turn(direction);
    }

    public static void changeGear() {

        int option = 1;
        if (car.getGear() == 0) {
            option = 1;
        } else if (car.getGear() == 6) {
            option = 0;
        } else {
            System.out.printf("Para qual marcha deseja passar? \n 0 -> %s marcha \n 1 -> %s marcha\n",
                    car.getGear() - 1, car.getGear() + 1);
            option = scanner.nextInt();
        }
        car.changeGear(option);
    }

}
