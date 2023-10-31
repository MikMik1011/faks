package pv3;

public class Umetnik {
    private String ime;
    private UmetnickoDelo[] dela;
    private int brojDela;

    public Umetnik(String ime, int brojDela) {
        this.ime = ime;
        this.dela = new UmetnickoDelo[brojDela];
        this.brojDela = 0;
    }

    public String getIme() {
        return this.ime;
    }

    public UmetnickoDelo[] getDela() {
        return this.dela;
    }

    public int getBrojDela() {
        return this.brojDela;
    }

    public boolean izlozi(UmetnickoDelo d) {
        boolean ableToAdd = brojDela < dela.length;
        if (ableToAdd)
            dela[brojDela++] = d;

        return ableToAdd;
    }

    public double vrednost() {
        double sum = 0.0;
        for (UmetnickoDelo delo : dela) {
            if (delo == null)
                break;
            sum += delo.getCena();
        }
        return sum;
    }

}
