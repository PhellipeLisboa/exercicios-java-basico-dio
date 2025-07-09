package herancaEPolimorfismo.exercicio1;

public sealed class Ticket permits HalfPriceTicket, FamilyTicket {

    protected double price;
    protected String movieName;
    protected boolean isDubbed;

    public Ticket(double price, String movieName, boolean isDubbed) {
        this.price = price;
        this.movieName = movieName;
        this.isDubbed = isDubbed;
    }

    public double getRealValue() {
        return price;
    }

    @Override
    public String toString() {
        return "=========================================================\nTicket" + "\n" +
                "price=" + price + "\n" +
                "movieName='" + movieName + '\'' + "\n" +
                "isDubbed=" + isDubbed + "\n" +
                "realValue=" + getRealValue() + "\n" +
                "=========================================================\n";
    }

}
