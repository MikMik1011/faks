import java.util.Comparator;

public class CompareByName implements Comparator<Film> {
    
    public int compare(Film f1, Film f2) {
        return f1.getNaziv().compareTo(f2.getNaziv());
    }
    
}