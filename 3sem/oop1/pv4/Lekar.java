/**
 * Pacijent
 */
abstract public class Lekar {

    protected String ime;
    protected String prezime;
    protected Pacijent[] pacijenti;
    protected int brojPacijenata = 0;


    public Lekar(String ime, String prezime, int maxPacijenti) {
        this.ime = ime;
        this.prezime = prezime;
        this.pacijenti = new Pacijent[maxPacijenti];
    }


    public String getIme() {
        return this.ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public int getBrojPacijenata() {
        return this.brojPacijenata;
    }
    
    public Pacijent[] getPacijenti() {
        return this.pacijenti;
    }

    public boolean prihvati(Pacijent p) {
        boolean able = brojPacijenata < pacijenti.length - 1;
        if(able)
            pacijenti[brojPacijenata++] = p;
        return able;
    }

    public abstract int plata();

    @Override
    public String toString() {
        return "{" +
            " ime='" + getIme() + "'" +
            ", prezime='" + getPrezime() + "'" +
            ", brojPacijenata='" + getBrojPacijenata() + "'" +
            "}";
    }


}