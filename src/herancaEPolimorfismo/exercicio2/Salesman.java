package herancaEPolimorfismo.exercicio2;

public final class Salesman extends User {

    private static int numberOfSales;

    public Salesman(String name, String email, String password) {
        super(name, email, password, false);
        numberOfSales = 0;
    }

    public void makeSale() {

        if (isLogged) {
            numberOfSales++;
            System.out.println("Venda concluída com sucesso.");
        } else {
            System.out.println("O usuário precisa estar logado para realizar a ação");
        }

    }

    public void checkSales() {

        if (isLogged) {
            System.out.printf("%s vendas realizadas\n", numberOfSales);
        } else {
            System.out.println("O usuário precisa estar logado para realizar a ação");
        }

    }

    public static int getNumberOfSales(){
        return numberOfSales;
    }

}
