package classesEEncapsulamento.exercicio1;

import java.util.Scanner;

public class Main {

    public final static Scanner scanner = new Scanner(System.in);
    public static BankAccount bankAccount;

    public static void main(String[] args) {

        var option = -1;
        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Consultar cheque especial");
            System.out.println("4 - Depositar dinheiro");
            System.out.println("5 - Sacar dinheiro");
            System.out.println("6 - Pagar um boleto");
            System.out.println("7 - Verificar se a conta está usando cheque especial");
            System.out.println("0 - Sair");
            System.out.println("============================");
            option = scanner.nextInt();

            switch(option) {
                case 1 -> createBankAccount();
                case 2 -> bankAccount.checkBalance();
                case 3 -> bankAccount.checkOverdraftLimit();
                case 4 -> deposit();
                case 5 -> withdraw();
                case 6 -> payBill();
                case 7 -> isUsingOverdraft();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida.");
            }

        } while (option != 0);

    }

    public static void test() {
        return;
    }

    public static void createBankAccount() {

        System.out.println("Faça o depósito inicial: ");
        double balance = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Informe seu nome: ");
        String name = scanner.nextLine();
        Main.bankAccount = new BankAccount(name, balance);
        System.out.printf("Prezado(a) %s, sua conta foi criada com sucesso.\n", name);
    }

    public static void deposit() {

        System.out.println("Insira a quantia a ser depositada: ");
        double amount = scanner.nextDouble();
        bankAccount.deposit(amount);

    }

    public static void withdraw() {
        System.out.println("Insira a quantia que deseja sacar: ");
        double amount = scanner.nextDouble();
        bankAccount.withdraw(amount);
    }

    public static void payBill() {
        System.out.println("Insira a preço do boleto: ");
        double price = scanner.nextDouble();
        bankAccount.payBill(price);
    }

    public static void isUsingOverdraft() {
        System.out.println(bankAccount.isUsingOverdraft() ? String.format("Prezado(a) %s, você está utilizando o cheque " +
                "especial.\n", bankAccount.getName()) : String.format("Prezado(a) %s, você não está utilizando o cheque " +
                "especial.\n", bankAccount.getName()));
    }

}
