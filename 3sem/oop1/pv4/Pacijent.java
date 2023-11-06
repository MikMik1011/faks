/**
 * Pacijent
 */
public class Pacijent {

    protected String ime;
    protected String prezime;
    protected int godine;


    public Pacijent(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }


    public String getIme() {
        return this.ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public int getGodine() {
        return this.godine;
    }

    @Override
    public String toString() {
        return "{" +
            " ime='" + getIme() + "'" +
            ", prezime='" + getPrezime() + "'" +
            ", godine='" + getGodine() + "'" +
            "}";
    }


}