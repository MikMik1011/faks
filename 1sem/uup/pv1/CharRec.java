public class CharRec {
    public static void main(String[] args) {
        char c = Svetovid.in.readChar("Unesite znak: ");
        if (Character.isLetter(c)) Svetovid.out.println("Karakter je slovo.");
        else if (Character.isDigit(c)) Svetovid.out.println("Karakter je broj.");
        else Svetovid.out.println("Karakter je specijalni znak.");

    }
}
