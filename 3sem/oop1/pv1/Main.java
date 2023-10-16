public class Main {
    public static void main(String[] args) {
        Kladionicar[] kladionicari = new Kladionicar[8];
        kladionicari[0] = new Kladionicar("Pera", "poker", 15000);
        kladionicari[1] = new Kladionicar("Mika", "ajnc", 17000);
        kladionicari[2] = new Kladionicar("Zika", "rulet", -1500);
        kladionicari[3] = new Kladionicar("Bora", "ajnc", -11000);
        kladionicari[4] = new Kladionicar("Dora", "rulet", 5000);
        kladionicari[5] = new Kladionicar("Zora", "ajnc", -3000);
        kladionicari[6] = new Kladionicar("Lara", "poker", 22000);
        kladionicari[7] = new Kladionicar("Mara", "nista", 7000);

        Kazino kazino = new Kazino(kladionicari);
        System.out.println(kazino);
        System.out.println(kazino.najprofitablinijaIgra());

    }
}
