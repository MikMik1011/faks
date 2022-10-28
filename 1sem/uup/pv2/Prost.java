package pv2;

import org.svetovid.Svetovid;

public class Prost {

    private static int readN() {
        int n;
        do {
            n = Svetovid.in.readInt("Unesite prirodan broj:");
        }
        while (n < 1);
        return n;
    }
    public static void main(String[] args) {

        int n = readN();

        if (n < 4) {
            Svetovid.out.print("Broj " + n + " je prost!");
            return;
        }

        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                Svetovid.out.print("Broj " + n + " je slozen!");
                return;
            }
        }
        Svetovid.out.print("Broj " + n + " je prost!");
        
    }
}
