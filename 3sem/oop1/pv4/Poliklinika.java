import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Poliklinika {
    private Lekar[] lekari;

    public Poliklinika(String lekariFileName, String pacijentiFileName) throws IOException {
        loadLekari(lekariFileName);
        loadPacijenti(pacijentiFileName);
    }

    private void loadLekari(String filename) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        int len = Integer.parseInt(br.readLine().trim());
        lekari = new Lekar[len];

        for(int i = 0; i < len; ++i) {
            String ime = br.readLine().trim();
            String prezime = br.readLine().trim();
            String tipLekara = br.readLine().trim();
            
            if(tipLekara.equals("pedijatar"))
                lekari[i] = new Pedijatar(ime, prezime);
            else if(tipLekara.equals("pulmolog"))
                lekari[i] = new Pulmolog(ime, prezime);
        }
        br.close();
    } 

    private int randomInt(int max) {
        return (int) Math.round(Math.random() * max);
    } 

    private void loadPacijenti(String filename) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        int len = Integer.parseInt(br.readLine().trim());
        for(int i = 0; i < len; ++i) {
            String ime = br.readLine().trim();
            String prezime = br.readLine().trim();
            int godine = Integer.parseInt(br.readLine().trim());
            int index = randomInt(lekari.length - 1);
            lekari[index].prihvati(new Pacijent(ime, prezime, godine));
        }
        br.close();
    } 

    public Lekar najsiromasnijiPulmolog() {
        int min = 0;
        int index = -1;
        for(int i = 0; i < lekari.length; ++i) {
            Lekar l = lekari[i];
            if(l instanceof Pulmolog && (index == -1 || l.plata() < min))
                min = l.plata(); 
                index = i;
        }
        return lekari[index];
    }

    public Lekar pedijatarSaNajmatorijomDecom() {
        double max = 0;
        int index = -1;
        for(int i = 0; i < lekari.length; ++i) {
            Lekar l = lekari[i];
            int brojPacijenata = l.getBrojPacijenata();
            if(brojPacijenata == 0)
                continue;

            int sum = 0;
            Pacijent[] pacijenti = l.getPacijenti();
            for(int j = 0; j < brojPacijenata; ++j) {
                sum += pacijenti[j].getGodine();
            }
            double prosek = sum / brojPacijenata;
            if(index == -1 || prosek > max) {
                max = prosek;
                index = i;
            }
        }
        return lekari[index];
    }
}
