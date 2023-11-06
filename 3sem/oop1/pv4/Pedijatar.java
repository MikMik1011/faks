public class Pedijatar extends Lekar {

    public Pedijatar(String ime, String prezime) {
        super(ime, prezime, 200);
    }

    @Override
    public boolean prihvati(Pacijent p) {
        boolean able = (brojPacijenata < pacijenti.length - 1) && (p.getGodine() < 18);
        if(able)
            pacijenti[brojPacijenata++] = p;
        return able;
    }

    public int plata() {
        int plata = pacijenti.length * 300;
        for(Pacijent p : pacijenti) {
            if(p != null && p.getGodine() < 5)
                plata += 100;
        }
        return plata;
    }


}
