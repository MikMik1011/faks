import java.util.Arrays;

import org.svetovid.Svetovid;
import org.svetovid.io.SvetovidReader;
import org.svetovid.io.SvetovidWriter;


public class Main {
    public static void sortArray(Film[] filmovi, int type) {
        switch (type) {
            case 1:
                Arrays.sort(filmovi, new CompareByID());
                break;
            case 2:
                Arrays.sort(filmovi, new CompareByName());
                break;
            case 3:
                Arrays.sort(filmovi, new CompareByDirector());
                break;
            case 4:
                Arrays.sort(filmovi, new CompareLex());
                break;
        
            default:
                Svetovid.out.println("Invalid type!")
                break;
        }
    } 

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

        file.close();

        sortArray(filmovi, Svetovid.in.readInt());

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
