package pv4;

import org.svetovid.Svetovid;

public class Prosek {

    private static int readN() {
        int n;
        do {
            n = Svetovid.in.readInt("Unesite broj elemenata:");
        } while (n < 1 || n > 100);
        return n;
    }

    public static void main(String[] args) {
        int n = readN();
        int sum = 0;

        for (int i = 0; i < n; ++i)
            sum += Svetovid.in.readInt("Unesite " + (i + 1) + ". broj:");
        Svetovid.out.println("Prosek iznosi: " + (double) sum / n);
    }
}
