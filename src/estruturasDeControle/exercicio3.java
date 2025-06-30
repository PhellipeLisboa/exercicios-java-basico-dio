package estruturasDeControle;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int firstNumber = scanner.nextInt();

        System.out.printf("Digite um número maior que %s: \n", firstNumber);
        int secondNumber = scanner.nextInt();

        System.out.println("Deseja ver os número pares ou ímpares? (p/i)");
        String parity = scanner.next();

        boolean even = parity.equalsIgnoreCase("p");

        // firstNumber = 3 (p) -> start: 4
        // firstNumber = 3 (i) -> start: 3

        // firstNumber = 4 (i) -> start: 5
        // firstNumber = 4 (p) -> start: 4

        int start = firstNumber;
        if ((firstNumber % 2 != 0 && even) || (firstNumber % 2 == 0 && !even)) {
            start = firstNumber + 1;
        }

        for (int i = start; i <= secondNumber; i+=2) {
            System.out.println(i);
        }

    }

}
