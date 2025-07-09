package herancaEPolimorfismo.exercicio2;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager("Phellipe", "phellipe@phellipe.com", "23456");
        Salesman salesman = new Salesman("Phelliperson", "phelliperson@phellisperson", "34567");
        Clerk clerk = new Clerk("Phellipilson", "phellipilson@phellipilson.com", "45678");

        manager.login();
        manager.userInfo();
        //manager.logoff();
        manager.updateData("Phellipeee", "phe@phe.com", "23456");
        manager.userInfo();
        manager.changePassword("23456", "teste");
        manager.updateData("FUNCIONOU", "FUNCIONOU", "teste");
        manager.userInfo();

        salesman.login();
        salesman.makeSale();
        salesman.checkSales();

        clerk.login();
        clerk.receivePayment(80);
        clerk.closeRegister();

        manager.generateReport();
        manager.checkSales();

        manager.logoff();
        salesman.logoff();
        clerk.logoff();

    }

}
