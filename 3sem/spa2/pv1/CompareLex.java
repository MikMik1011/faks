import java.util.Comparator;

public class CompareLex implements Comparator<Film> {
    
    public int compare(Film f1, Film f2) {
        int diff = f1.getReditelj().compareToIgnoreCase(f2.getReditelj());
        if(diff != 0)
            return diff;
        
        return f1.getNaziv().compareToIgnoreCase(f2.getNaziv());
    }
    
}