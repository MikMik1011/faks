package pv2;

import org.svetovid.Svetovid;

/**
 * Delitelji
 */
public class Delitelji {

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
        Svetovid.out.print("Delitelji broja " + n + " su: ");
        for(int i = 1; i <= n; ++i) {
            if (n % i == 0) Svetovid.out.print(i + ", ");
        }
    }
}