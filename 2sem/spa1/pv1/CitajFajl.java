package pv1;

import org.svetovid.Svetovid;

public class CitajFajl {

    private static void printWholeFile(String path) {
        Svetovid.out.println(Svetovid.in(path).readAll());
        Svetovid.in(path).close();
    }
    public static void main(String[] args) {
        String fileName = "fajl1.txt";

        if (!Svetovid.testIn(fileName)) {
            Svetovid.out.print("Fajl ne postoji!");
            return;
        }

        printWholeFile(fileName);
        printWholeFile(Svetovid.in.readToken("Unesite ime fajla: "));

    }
}
