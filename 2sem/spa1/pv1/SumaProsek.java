package pv1;

import org.svetovid.Svetovid;
import org.svetovid.io.SvetovidReader;

public class SumaProsek {
    public static void main(String[] args) {
        String fileName = "brojevi.txt";

        if (!Svetovid.testIn(fileName)) {
            Svetovid.out.print("Fajl ne postoji!");
            return;
        }

        SvetovidReader file = Svetovid.in(fileName);

        double sum = 0;
        int counter = 0;

        while (file.hasMore()) {
            sum += file.readDouble();
            counter++;
        }

        if (counter == 0) {
            Svetovid.out.println("Nijedan broj nije ucitan!");
            return;
        }

        Svetovid.out.println("Suma brojeva je: " + sum);
        Svetovid.out.println("Prosek brojeva je: " + sum / counter);

        file.close();
    }
}
