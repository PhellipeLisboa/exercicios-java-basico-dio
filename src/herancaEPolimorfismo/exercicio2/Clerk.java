package herancaEPolimorfismo.exercicio2;

public final class Clerk extends User {

    private static double cashInRegister;

    public Clerk(String name, String email, String password) {
        super(name, email, password, false);
        cashInRegister = 0;
    }

    public void receivePayment(double payment) {

        if (isLogged) {
            cashInRegister += payment;
            System.out.printf("Valor recebido: R$ %s \n", payment);
        } else {
            System.out.println("O usuário precisa estar logado para realizar a ação");
        }

    }

    public void closeRegister() {

        if (isLogged) {
            System.out.println("Fechando caixa.");
        } else {
            System.out.println("O usuário precisa estar logado para realizar a ação");
        }

    }

    public static double getCashInRegister() {
        return cashInRegister;
    }

}
