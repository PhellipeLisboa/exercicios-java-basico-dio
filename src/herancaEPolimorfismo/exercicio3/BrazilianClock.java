package herancaEPolimorfismo.exercicio3;

public final class BrazilianClock extends Clock {

    public BrazilianClock(int hour, int minutes, int seconds) {
        super(hour, minutes, seconds);
        this.maxHour = 23;
        this.minHour = 0;
        this.maxMinutes = 59;
        this.minMinutes = 0;
        this.maxSeconds = 59;
        this.minSeconds = 0;
        checkTimeValidity();
    }

    public void syncWith(Clock clock) {
        switch (clock) {
            case AmericanClock americanClock -> {

                if (americanClock.hour == 12 && americanClock.getIsAm()) {
                    this.hour = 0;
                } else if (americanClock.hour == 12 && americanClock.getIsPM()) {
                    this.hour = 12;
                } else if (americanClock.getTime().contains("PM")) {
                    this.hour = americanClock.getHour() + 12;
                } else {
                    this.hour = americanClock.getHour();
                }


                this.minutes = americanClock.getMinutes();
                this.seconds = americanClock.getSeconds();

            }
            case BrazilianClock brazilianClock-> {

                this.hour = brazilianClock.getHour();
                this.minutes = brazilianClock.getMinutes();
                this.seconds = brazilianClock.getSeconds();

            }
        }
    }
}
