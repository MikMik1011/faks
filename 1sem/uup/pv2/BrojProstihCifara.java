package pv2;

import org.svetovid.Svetovid;

public class BrojProstihCifara {

    private static int readN() {
        int n;
        do {
            n = Svetovid.in.readInt("Unesite prirodan broj:");
        }
        while (n < 1);
        return n;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= (n / 2); ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = readN();
        int count = 0;

        while (n > 0) {
            if (isPrime(n % 10)) ++count;
            n /= 10;
        }

        Svetovid.out.print("Broj ima " + count + " prostih cifara!");
    }
}
