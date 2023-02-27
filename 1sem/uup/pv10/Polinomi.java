package pv10;

import org.svetovid.Svetovid;

public class Polinomi {

    public static void main(String[] args) {
        Svetovid.out.println("Unos p(x): ");
        Polinom p = PolinomN.ucitaj();
        Svetovid.out.println("Unos g(x): ");
        Polinom g = PolinomN.ucitaj();

        Polinom proizvod = PolinomN.puta(p, g);
        Svetovid.out.print("p(x) * g(x) = ");
        PolinomN.stampaj(proizvod);
        Svetovid.out.println();

        Polinom r, xt3, x5, x;

        r = PolinomN.puta(g, g);

        double gOd5 = PolinomN.izracunaj(5, g);
        Polinom pGOd5 = new Polinom();
        pGOd5.st = 0;
        pGOd5.k[0] = gOd5;
        r = PolinomN.oduzmi(r, pGOd5);

        xt3 = PolinomN.brojPuta(p, 3);
        r = PolinomN.oduzmi(r, xt3);

        x5 = new Polinom();
        x5.st = 5;
        x5.k[5] = -2;
        r = PolinomN.oduzmi(r, x5);

        x = new Polinom();
        x.st = 1;
        x.k[1] = 3;
        r = PolinomN.saberi(r, x);

        Svetovid.out.print("r(x) = ");
        PolinomN.stampaj(r);
        Svetovid.out.println();

        double minVr = r.k[0];
        Polinom min = new Polinom();
        min.st = 0;
        min.k[0] = minVr;

        for(int i = 0; i <= r.st; ++i) {
            if (r.k[i] <  minVr) {
                minVr = r.k[i];
            }
        }

        for(int i = 0; i <= r.st; ++i) {
            if (r.k[i] != 0) 
                r.k[i] += 7;
        }

        Svetovid.out.print("r(x) nakon uvecanja = ");
        PolinomN.stampaj(r);
        Svetovid.out.println();

        Svetovid.out.print("Monom sa najmanjim koeficijentom: ");
        PolinomN.stampaj(min);
        Svetovid.out.println();





    }
}
