package pv3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Galerija gal = new Galerija("./pv3/Umetnici.txt", "./pv3/Dela.txt");
        System.out.println(gal.slikarSaNajstarijimDelom().getIme());
        gal.ispisiProsekUmetnika();

    }
}
