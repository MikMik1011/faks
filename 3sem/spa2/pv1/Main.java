package pv1;

import java.util.Arrays;

import org.svetovid.Svetovid;
import org.svetovid.io.SvetovidReader;
import org.svetovid.io.SvetovidWriter;

public class Main {
    public static void main(String[] args) {
        String fileName = Svetovid.in.readLine("Unesite ime fajla:");

        if(!Svetovid.testIn(fileName))  
            return;
        
        SvetovidReader file = Svetovid.in(fileName);
        
        int size = file.readInt();

        Film[] filmovi = new Film[size];

        for(int i = 0; i < size; ++i) {
            int id = Integer.parseInt(file.readLine().trim());
            String naziv = file.readLine();
            String reditelj = file.readLine();
            filmovi[i] = new Film(id, naziv, reditelj);
        }

        Arrays.sort(filmovi);

        file.close();

        fileName = Svetovid.in.readLine("Unesite ime fajla za save: ");
        if(!Svetovid.testOut(fileName))
            return;

        SvetovidWriter outFile = Svetovid.out(fileName);
        outFile.println(size);
        for(int i = 0; i < size; ++i) {
            outFile.println(filmovi[i]);
        }
        outFile.close();


        
    }
}
