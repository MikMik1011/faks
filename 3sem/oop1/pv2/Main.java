package pv2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SkolaJezika skola = new SkolaJezika("./pv2/kursevi.txt");
        System.out.println(skola.najnaprednijiJezik());
        skola.unaprediGrupu("engleski", "osnovni");   
    }
}
