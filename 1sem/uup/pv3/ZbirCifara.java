package pv3;

import org.svetovid.Svetovid;

public class ZbirCifara {

    private static int readN() {
        int n;
        do {
            n = Svetovid.in.readInt("Unesite prirodan broj:");
        } while (n < 1);
        return n;
    }

    public static void main(String[] args) {
        int n = readN();
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        Svetovid.out.println("Zbir cifara je: " + sum);
    }
}
