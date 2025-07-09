package herancaEPolimorfismo.exercicio3;

public sealed abstract class Clock permits AmericanClock, BrazilianClock {

    protected int hour;
    protected int minutes;
    protected int seconds;
    protected int maxHour;
    protected int minHour;
    protected int maxMinutes;
    protected int minMinutes;
    protected int maxSeconds;
    protected int minSeconds;

    public Clock(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String getTime() {
        return String.format("%02d:%02d:%02d", hour, minutes, seconds);
    }

    public abstract void syncWith(Clock clock);

    public void checkTimeValidity() {

        if (hour > maxHour
                || minutes > maxMinutes
                || seconds > maxSeconds
                || hour < minHour
                || minutes < minMinutes
                || seconds < minSeconds) {
            System.out.printf("O horário passado para o %s não está nos padrões do relógio escolhido.\n",
                    getClass().getSimpleName());
            System.out.printf("Horas inseridas: %s | Intervalo permitido: %s-%s \n", hour, minHour, maxHour);
            System.out.printf("Minutos inseridos: %s | Intervalo permitido: %s-%s \n", minutes, minMinutes, maxMinutes);
            System.out.printf("Segundos inseridos: %s | Intervalo permitido: %s-%s \n", seconds, minSeconds, maxSeconds);

            throw new IllegalArgumentException("Invalid time for BrazilianClock");

        }

    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
