package estruturasDeControle;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        int number = 0;

        while (number < 1 || number > 10) {
            System.out.println("Digite um número de 1 a 10 para ver sua tabuada.");
            number = scanner.nextInt();
        }

        System.out.printf("===========Tabuada do %s==========\n", number);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s x %s = %s \n", i, number, i * number);
        }


    }

}
