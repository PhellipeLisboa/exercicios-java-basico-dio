package herancaEPolimorfismo.exercicio1;

public final class HalfPriceTicket extends Ticket{

    public HalfPriceTicket(double price, String movieName, boolean isDubbed) {
        super(price, movieName, isDubbed);
    }

    @Override
    public double getRealValue() {
        return price * 0.5;
    }

    @Override
    public String toString() {
        return "=========================================================\nHalfPriceTicket" + "\n" +
                "price=" + price + "\n" +
                "movieName='" + movieName + '\'' + "\n" +
                "isDubbed=" + isDubbed + "\n" +
                "realValue=" + getRealValue() + "\n" +
                "=========================================================\n";
    }
}
