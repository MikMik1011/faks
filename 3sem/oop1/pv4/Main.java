import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Poliklinika p = new Poliklinika("./lekari.txt", "./pacijenti.txt");
        System.out.println(p.najsiromasnijiPulmolog());
        System.out.println(p.pedijatarSaNajmatorijomDecom());
    }
}
