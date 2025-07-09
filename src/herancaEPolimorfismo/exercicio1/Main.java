package herancaEPolimorfismo.exercicio1;

public class Main {

    public static void main(String[] args) {

        Ticket ticket = new Ticket(50, "Up, altas aventuras", false);
        Ticket halfPriceTicket = new HalfPriceTicket(50, "Up, altas aventuras", false);
        Ticket familyTicket = new FamilyTicket(50, "Up, altas aventuras", false, 4);

        System.out.println(ticket.toString());
        System.out.println(halfPriceTicket.toString());
        System.out.println(familyTicket.toString());
    }

}
