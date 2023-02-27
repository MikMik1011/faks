package pv1;

import org.svetovid.Svetovid;

public class Fajlovi {
    public static void main(String[] args) {
        String fileName = "fajl1.txt";
        Svetovid.out(fileName).println("Prvi red");
        Svetovid.out(fileName).println("Drugi red");
        Svetovid.out(fileName).println("");
        Svetovid.out(fileName).println("Cetvrti red");

        Svetovid.out(fileName).close();
    }
}