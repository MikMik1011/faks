package pv3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Galerija {
    private Umetnik[] umetnici;

    public Galerija(String umetniciFileName, String delaFileName) throws IOException {
        fillUmetnici(umetniciFileName);
        fillDela(delaFileName);
    }

    private void fillUmetnici(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        int length = Integer.parseInt(br.readLine().trim());
        umetnici = new Umetnik[length];

        for (int i = 0; i < length; ++i) {
            String[] line = br.readLine().trim().split(",");
            if (line.length == 1)
                umetnici[i] = new Slikar(line[0].trim());
            else
                umetnici[i] = new Umetnik(line[0].trim(), Integer.parseInt(line[1].trim()));
        }

        br.close();
    }

    private void fillDela(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        int length = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < length; ++i) {
            String ime = br.readLine().trim();
            String naziv = br.readLine().trim();
            int godina = Integer.parseInt(br.readLine().trim());
            double cena = Double.parseDouble(br.readLine().trim());

            for (int j = 0; j < umetnici.length; ++j) {
                if (!umetnici[j].getIme().equals(ime))
                    continue;

                UmetnickoDelo delo = new UmetnickoDelo(naziv, godina, cena);
                umetnici[j].izlozi(delo);
                break;
            }
        }

        br.close();
    }

    public Umetnik slikarSaNajstarijimDelom() {
        Umetnik oldest = null;
        int minYear = Slikar.getCurrYear();
        for (Umetnik um : umetnici) {
            if (!(um instanceof Slikar))
                continue;

            if (oldest == null) {
                oldest = um;
                continue;
            }

            int currMinYear = um.getDela()[0].getGodina();
            for (UmetnickoDelo d : um.getDela()) {
                if (d == null)
                    break;
                if (d.getGodina() < currMinYear)
                    currMinYear = d.getGodina();
            }

            if (currMinYear < minYear)
                oldest = um;
        }

        return oldest;
    }

    public void ispisiProsekUmetnika() {
        for (Umetnik um : umetnici) {
            System.out.println(
                    String.format("Vrednost umetnika %s iznosi %.2f", um.getIme(), um.vrednost() / um.getBrojDela()));
        }
    }

}
