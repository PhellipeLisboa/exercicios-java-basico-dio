package herancaEPolimorfismo.exercicio3;

public final class AmericanClock extends Clock{

    private boolean isAM;

    public AmericanClock(int hour, int minutes, int seconds, boolean isAM) {
        super(hour, minutes, seconds);
        this.maxHour = 12;
        this.minHour = 1;
        this.maxMinutes = 59;
        this.minMinutes = 0;
        this.maxSeconds = 59;
        this.minSeconds = 0;
        this.isAM = isAM;
        checkTimeValidity();
    }

    @Override
    public String getTime() {

        return isAM ? super.getTime() + " AM" : super.getTime() + " PM";

    }

    public void syncWith(Clock clock) {

        switch (clock) {
            case AmericanClock americanClock -> {
                this.hour = americanClock.getHour();
                this.minutes = americanClock.getMinutes();
                this.seconds = americanClock.getSeconds();
                if (americanClock.getIsAm()) {
                    setIsAM();
                } else {
                    setIsPM();
                }
            }
            case BrazilianClock brazilianClock-> {

                if (brazilianClock.hour > 12) {
                    this.hour = brazilianClock.getHour() - 12;
                    setIsPM();
                } else if (brazilianClock.getHour() == 12) {
                    this.hour = 12;
                    setIsPM();
                }else if (brazilianClock.getHour() == 0) {
                    this.hour = 12;
                    setIsAM();
                } else {
                    this.hour = brazilianClock.getHour();
                    setIsAM();
                }
                this.minutes = brazilianClock.getMinutes();
                this.seconds = brazilianClock.getSeconds();

            }
        }
    }

    public void setIsAM() {
        this.isAM = true;
    }

    public void setIsPM() {
        this.isAM = false;
    }

    public boolean getIsAm() {
        return this.isAM;
    }

    public boolean getIsPM() {
        return !this.isAM;
    }

}
