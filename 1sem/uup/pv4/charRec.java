package pv4;

import org.svetovid.Svetovid;

public class charRec {

    private static boolean isInterpunction(char c) {
        char[] chars = { '.', ',', ';', ':', '?', '!' };

        for (char i : chars) {
            if (c == i)
                return true;
        }
        return false;

    }

    public static void main(String[] args) {
        char c;
        int letCount = 0;
        int digCount = 0;
        int interpCount = 0;
        int ostCount = 0;

        do {
            c = Svetovid.in.readChar("Unesite znak:");
            if (Character.isLetter(c))
                ++letCount;
            else if (Character.isDigit(c))
                ++digCount;
            else if (isInterpunction(c))
                ++interpCount;
            else
                ++ostCount;
        } while (c != '.');

        Svetovid.out.println("Broj slova: " + letCount);
        Svetovid.out.println("Broj cifara: " + digCount);
        Svetovid.out.println("Broj interpunkcijskih znakova: " + interpCount);
        Svetovid.out.println("Broj ostalih znakova: " + ostCount);
        
    }
}
