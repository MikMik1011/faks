public class Bankomat {
    public static void main(String[] args) {
        int suma = Svetovid.in.readInt("Unesite sumu:");
        int[] apoeni = {100, 50, 20, 10, 5, 2, 1};

        Svetovid.out.print("Bankomat Vam je izdao ");

        for(int i : apoeni) {
            Svetovid.out.print(suma / i + " novcanica od " + i + ", ");
            suma %= i;
            if(suma == 0) return;
        }
    }
}
