package pv3;

import org.svetovid.Svetovid;

public class SumLessThanN {

    private static int readN() {
        int n;
        do {
            n = Svetovid.in.readInt("Unesite prirodan broj:");
        } while (n < 1);
        return n;
    }

    private static int sum(int n) {
        int zbir = 0;

        for (int i = 1; i <= n; ++i) {
            zbir += i;
        }

        return zbir;
    }

    public static void main(String[] args) {
        int n = readN();

        int i = 1;
        while(sum(i) < n){
            ++i;
        }
        Svetovid.out.println("Trazeni broj je: " + (i - 1));

    }
}
