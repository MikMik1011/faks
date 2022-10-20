class Sredina {
    public static void main(String[] args ) {
        int a = Svetovid.in.readInt("Unesite prvi broj:");
        int b = Svetovid.in.readInt("Unesite drugi broj:");
        double c = (a + b) / 2.0;
        Svetovid.out.print("Sredina je: " + c);
    }
}