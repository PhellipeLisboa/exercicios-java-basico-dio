package classesEEncapsulamento.exercicio1;

public class BankAccount {

    private final String name;
    private double balance;
    private final double overdraftLimit;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;

        if (balance <= 500.0) {
            this.overdraftLimit = 50.0;
        } else {
            this.overdraftLimit = 0.5 * balance;
        }

    }

    public double getAvailableBalance() {
        return balance + overdraftLimit;
    }

    public double checkBalance() {
        System.out.printf("Prezado(a)%s, o saldo atual de sua conta é de R$ %s \n", name, balance);
        return balance;
    }

    public void checkOverdraftLimit() {
        System.out.printf("Prezado(a)%s, seu cheque especial é de R$ %s \n", name, overdraftLimit);
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.printf("Prezado(a)%s, um depósito de R$ %s foi realizado em sua conta.\n", name, amount);
        } else {
            System.out.println("Operação negada. Insira um valor válido para realizar o depósito.");
        }
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.printf("Prezado(a)%s, o saque de R$ %s foi realizado com sucesso.\n", name, amount);
        } else if (amount < getAvailableBalance()) {
            double overdraftUsed = amount - balance;
            double fee = overdraftUsed * 0.20;
            balance = -(overdraftUsed + fee);
            System.out.printf("Prezado(a)%s, o saque de R$ %s foi realizado com sucesso. Você utilizou R$ %s de seu " +
                    "cheque especial.\n", name, amount, overdraftUsed);
            System.out.printf("Uma taxa de R$ %.2f foi aplicada sobre o valor utilizado do cheque especial.\n", fee);
        } else {
            System.out.printf("Prezado(a)%s, seu saldo é insuficiente para realizar o saque. \n", name);
        }

    }

    public void payBill(double price) {

        if (price <= balance) {
            balance -= price;
            System.out.printf("Prezado(a)%s, o boleto no valor de R$ %s foi pago com sucesso.\n", name, price);
        } else if (price < getAvailableBalance()) {
            double overdraftUsed = price - balance;
            double fee = overdraftUsed * 0.20;
            balance = -(overdraftUsed + fee);
            System.out.printf("Prezado(a)%s, o boleto no valor de R$ %s foi pago com sucesso. Você utilizou R$ %s de seu " +
                    "cheque especial.\n", name, price, overdraftUsed);
            System.out.printf("Uma taxa de R$ %.2f foi aplicada sobre o valor utilizado do cheque especial.\n", fee);
        } else {
            System.out.printf("Prezado(a)%s, seu saldo é insuficiente para pagar o boleto. \n", name);
        }

    }

    public boolean isUsingOverdraft() {
        return balance < 0;
    }

    public String getName() {
        return this.name;
    }

}
