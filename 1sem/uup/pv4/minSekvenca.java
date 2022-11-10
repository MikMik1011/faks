package pv4;

import org.svetovid.Svetovid;

public class minSekvenca {

    public static void main(String[] args) {
        int a = Svetovid.in.readInt("Unesite broj a:");
        int b = Svetovid.in.readInt("Unesite broj b:");

        int min = b;
        int counter = 0;
        int input;
        while (true) {
            input = Svetovid.in.readInt("Unesite broj:");
            if (input < a || input > b)
                break;
            else if (input < min)
                min = input;
            ++counter;
        }

        Svetovid.out.println("Korisnik je uneo " + counter + " brojeva.");
        Svetovid.out.println("Najmanji medju njima je: " + min);

    }
}
