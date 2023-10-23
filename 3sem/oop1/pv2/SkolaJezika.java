package pv2;

import java.io.*;
import java.util.Arrays;

public class SkolaJezika {
    private Kurs[] kursevi;

    public SkolaJezika(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        int lines = Integer.parseInt(br.readLine().trim());
        kursevi = new Kurs[lines];

        for (int i = 0; i < lines; ++i) {
            String[] kursData = br.readLine().split(",");
            String jezik = kursData[0].trim();
            String nivo = kursData[1].trim();
            int brojPolaznika = Integer.parseInt(kursData[2].trim());
            kursevi[i] = new Kurs(jezik, nivo, brojPolaznika);
        }

        br.close();
    }

    public String najnaprednijiJezik() {
        String[] nivoi = Kurs.getNivoi();
        String jezik = this.kursevi[0].getJezik();
        int max = 0;
        for (Kurs k : kursevi) {
            if (k.getNivo().equals(nivoi[nivoi.length - 1]))
                continue;

            int brojPolaznika = k.getBrojPolaznika();
            if (brojPolaznika <= max)
                continue;

            max = brojPolaznika;
            jezik = k.getJezik();
        }

        return jezik;
    }

    private int findKursIndex(String jezik, String nivo) {
        int index = -1;
        for (int i = 0; i < this.kursevi.length; ++i) {
            Kurs k = this.kursevi[i];
            if (!k.getJezik().equals(jezik) || !k.getNivo().equals(nivo))
                continue;

            index = i;
            break;
        }
        return index;

    }

    public void unaprediGrupu(String jezik, String nivo) {
        String[] nivoi = Kurs.getNivoi();

        int index = findKursIndex(jezik, nivo);
        if (index == -1)
            return;

        Kurs kurs = this.kursevi[index];
        if(kurs.getNivo().equals(nivoi[nivoi.length -1])) 
            return;

        int currlevel = Arrays.asList(nivoi).indexOf(kurs.getNivo());
        nivo = nivoi[++currlevel];
        kurs.setNivo(nivo);

        for(int i = index + 1; i < this.kursevi.length; ++i) {
            Kurs nextKurs = this.kursevi[i];
            if(!nextKurs.getJezik().equals(jezik) || !nextKurs.getNivo().equals(nivo))
                continue;

            System.out.println(String.format("Postoje 2 ista kursa %s %s; potrebno ih je spojiti!", jezik, nivo));
            return;
        }
        
        

        
    }

}
