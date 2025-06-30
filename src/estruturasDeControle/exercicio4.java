package estruturasDeControle;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int denominator = scanner.nextInt();

        while (true) {

            int numerator = 0;
            while (numerator < denominator) {
                System.out.printf("Digite um múltiplo de %s (Caso não seja um múltiplo o programa será encerrado): \n", denominator);
                numerator = scanner.nextInt();
            }

            int quotient = numerator / denominator;
            int remainder = numerator % denominator;

            System.out.printf("%s / %s = %s | Resto: %s\n", numerator, denominator, quotient, remainder);
            System.out.println("------------------------------------------------------------------------------");

            if (remainder != 0) {
                System.out.println("Encerrando o programa...");
                break;
            }


        }

    }

}
