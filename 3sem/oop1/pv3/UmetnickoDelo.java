package pv3;

public class UmetnickoDelo {
    private String naziv;
    private int godina;
    private double cena;

    public UmetnickoDelo(String naziv, int godina, double cena) {
        this.naziv = naziv;
        this.godina = godina;
        this.cena = cena;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return this.godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public double getCena() {
        return this.cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return String.format("{naziv='%s' godina=%i' cena='%.2f'}", getNaziv(), getGodina(), getCena());
    }

}
