package estruturasDeControle;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        float height = scanner.nextFloat();

        System.out.println("Digite seu peso: ");
        float weight = scanner.nextFloat();

        float imc = weight / (height * height);

        String message = "";
        if (imc <= 18.5) {
            message = "Abaixo do peso";
        } else if (imc <= 24.9) {
            message = "Peso ideal";
        } else if (imc <= 29.9) {
            message = "Levementa acima do peso";
        }  else if (imc <= 34.9) {
            message = "Obesidade Grau I";
        }  else if (imc <= 39.9) {
            message = "Obesidade Grau II (Severa)";
        }  else {
            message = "Obesidade III (Mórbida)";
        }

        System.out.println(message);
    }

}
