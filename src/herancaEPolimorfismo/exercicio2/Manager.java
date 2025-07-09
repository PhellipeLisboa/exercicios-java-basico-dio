package herancaEPolimorfismo.exercicio2;

public final class Manager extends User {

    public Manager(String name, String email, String password) {
        super(name, email, password, true);
    }

    public void generateReport() {

        if (isLogged) {
            System.out.println("====Relatório de Vendas====");
            checkSales();
            System.out.printf("Valor em caixa: R$ %s \n", Clerk.getCashInRegister());
            System.out.println("===========================");
        } else {
            System.out.println("O usuário precisa estar logado para realizar a ação");
        }

    }

    public void checkSales() {

        if (isLogged) {
            System.out.printf("%s vendas realizadas.\n", Salesman.getNumberOfSales());
        } else {
            System.out.println("O usuário precisa estar logado para realizar a ação");
        }

    }

}
