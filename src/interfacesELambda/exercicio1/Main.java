package interfacesELambda.exercicio1;

import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        MessageService sms = message -> String.format("Enviando SMS: %s\n", message);
        MessageService email = message -> String.format("Enviando E-mail: %s\n", message);
        MessageService socialMedia = message -> String.format("Publicando nas redes sociais: %s\n", message);
        MessageService whatsApp = message -> String.format("Enviando mensagem no WhatsApp: %s\n", message);

        do {

            System.out.println("Digite a mensagem que deseja enviar: ");
            String message = scanner.nextLine();

            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - SMS");
            System.out.println("2 - E-mail");
            System.out.println("3 - Redes Sociais");
            System.out.println("4 - WhatsApp");
            System.out.println("0 - Sair");
            System.out.println("============================");

            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 0) {
                System.exit(0);
            }

            String sentMessage = switch (option) {

                case 1 -> sms.send(message);
                case 2 -> email.send(message);
                case 3 -> socialMedia.send(message);
                case 4 -> whatsApp.send(message);
                default -> {
                    System.out.println("Opção inválida.");
                    yield " ";
                }
            };

            System.out.println(sentMessage);

        } while(true);


    }

}
