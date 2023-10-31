package pv3;

public class Slikar extends Umetnik {
    private static final int CURR_YEAR = 2023;
    private static final int PRICE_INCREASE = 15;
    private static final int MAX_DELA = 5;

    public Slikar(String ime) {
        super(ime, Slikar.MAX_DELA);
    }

    @Override
    public double vrednost() {
        double sum = 0.0;
        for (UmetnickoDelo delo : getDela()) {
            if (delo == null)
                continue;
            sum += delo.getCena() * Math.pow(1 + (Slikar.PRICE_INCREASE / 100), Slikar.CURR_YEAR - delo.getGodina());
        }
        return sum;
    }

    public static int getCurrYear() {
        return CURR_YEAR;
    }

}
