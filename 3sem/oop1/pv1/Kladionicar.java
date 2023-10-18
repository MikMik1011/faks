import java.util.Arrays;

public class Kladionicar {
    private String ime;
    private String imeIgre;
    private int stanje;

    public Kladionicar(String ime, String imeIgre, int stanje) {
        this.ime = ime;
        this.setImeIgre(imeIgre);
        this.stanje = stanje;
    }

    public String getIme() {
        return ime;
    }

    public String getImeIgre() {
        return imeIgre;
    }

    public int getStanje() {
        return stanje;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setImeIgre(String imeIgre) {
        String[] igre = { "poker", "ajnc", "rulet" };
        this.imeIgre = Arrays.asList(igre).contains(imeIgre) ? imeIgre : "poker";
    }

    public void setStanje(int stanje) {
        this.stanje = stanje;
    }

    @Override
    public String toString() {
        return String.format("%s igra %s i ima %d na racunu.", ime, imeIgre, stanje);
    }
}
