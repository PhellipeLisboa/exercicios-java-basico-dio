package herancaEPolimorfismo.exercicio3;

public class Main {

    public static void main(String[] args) {

        AmericanClock americanClock = new AmericanClock(10,20,30, false);
        BrazilianClock brazilianClock = new BrazilianClock(2,20,30);

        System.out.println("=================================");
        showTime(americanClock);
        System.out.println("=================================");
        showTime(brazilianClock);
        System.out.println("=================================");

//        AmericanClock americanClock2 = new AmericanClock(11,33,58, true);
//        BrazilianClock brazilianClock2 = new BrazilianClock(17,50,0);
//
//        americanClock.syncWith(americanClock2);
//        System.out.println("American clock 2:");
//        showTime(americanClock2);
//        System.out.println("American clock synced:");
//        showTime(americanClock);
//        System.out.println("=================================");
//
//        americanClock.syncWith(brazilianClock);
//        System.out.println("Brazilian clock:");
//        showTime(brazilianClock);
//        System.out.println("American clock synced:");
//        showTime(americanClock);
//        System.out.println("=================================");
//
//        brazilianClock.syncWith(brazilianClock2);
//        System.out.println("Brazilian clock2:");
//        showTime(brazilianClock2);
//        System.out.println("Brazilian clock synced:");
//        showTime(brazilianClock);
//        System.out.println("=================================");
//
//        brazilianClock.syncWith(americanClock);
//        System.out.println("American clock:");
//        showTime(americanClock);
//        System.out.println("Brazilian clock synced:");
//        showTime(brazilianClock);
//        System.out.println("=================================");
    }

    public static void showTime(Clock clock) {
        System.out.println(clock.getTime());
    }

}
