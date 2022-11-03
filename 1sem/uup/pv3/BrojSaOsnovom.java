package pv3;

import org.svetovid.Svetovid;

public class BrojSaOsnovom {

    private static int readN() {
        int n;
        do {
            n = Svetovid.in.readInt("Unesite prirodan broj:");
        } while (n < 1);
        return n;
    }

    private static int readM() {
        int n;
        do {
            n = Svetovid.in.readInt("Unesite osnovu: ");
        } while (n < 2 || n > 10);
        return n;
    }

    public static void main(String[] args) {
        int n = readN();
        int m = readM();
        int sum = 0;
        int count = 0;

        while (n > 0) {
            int cifra = n % 10;

            if (cifra > m) {
                Svetovid.out.println("Broj nije u validnom formatu!");
                return;
            }
            sum += cifra * Math.pow(m, count++);

            n /= 10;
        }

        Svetovid.out.println("Uneti broj u dekadnom sistemu iznosi: " + sum);
    }
}
