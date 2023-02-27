package pv1;

import org.svetovid.Svetovid;
import org.svetovid.io.SvetovidReader;
import org.svetovid.io.SvetovidWriter;

public class Imena {
    public static void main(String[] args) {
        String fileName = "imena.txt";

        if (!Svetovid.testIn(fileName)) {
            Svetovid.out.print("Fajl ne postoji!");
            return;
        }

        SvetovidReader file = Svetovid.in(fileName);

        String userName = Svetovid.in.readToken("Unesite ime:");

        while(file.hasMore()) {
            if (file.readLine().equals(userName)) {
                Svetovid.out.println("Ime postoji u fajlu!");
                return;
            }
        }

        file.close();

        SvetovidWriter appendFile = Svetovid.append(fileName);
        appendFile.println(userName);
        appendFile.close();
        Svetovid.out.println(userName + " ubacen u fajl!");
    }


}
