public class Pulmolog extends Lekar {

    public Pulmolog(String ime, String prezime) {
        super(ime, prezime, 100);
    }

    public int plata() {
        int plata = pacijenti.length * 500;
        return plata;
    }


}
