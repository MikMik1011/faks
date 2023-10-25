package pv1;

public class Film implements Comparable<Film> {
    private int id;
    private String naziv;
    private String reditelj;


    public Film(int id, String naziv, String reditelj) {
        this.id = id;
        this.naziv = naziv;
        this.reditelj = reditelj;
    }

    @Override
    public int compareTo(Film film2) {
        int diff = this.getReditelj().compareToIgnoreCase(film2.getReditelj());
        if(diff != 0)
            return diff;
        
        return this.getNaziv().compareToIgnoreCase(film2.getNaziv());
   
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getReditelj() {
        return this.reditelj;
    }

    public void setReditelj(String reditelj) {
        this.reditelj = reditelj;
    }


    @Override
    public String toString() {
        return getId() + "\n" + getNaziv() + "\n" + getReditelj();
    }


}
