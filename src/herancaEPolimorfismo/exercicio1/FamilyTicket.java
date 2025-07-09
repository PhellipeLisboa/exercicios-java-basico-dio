package herancaEPolimorfismo.exercicio1;

public final class FamilyTicket extends Ticket{

    private final int numberOfPeople;

    public FamilyTicket(double price, String movieName, boolean isDubbed, int numberOfPeople) {
        super(price, movieName, isDubbed);
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public double getRealValue() {
        return (numberOfPeople > 3) ? 0.95 * (price * numberOfPeople) : (price * numberOfPeople);
    }

    @Override
    public String toString() {
        return "=========================================================\nFamilyTicket" + "\n" +
                "numberOfPeople=" + numberOfPeople + "\n" +
                "price=" + price + "\n" +
                "movieName='" + movieName  + '\'' + "\n" +
                "isDubbed=" + isDubbed + "\n" +
                "realValue=" + getRealValue() + "\n" +
                "=========================================================\n";
    }
}
