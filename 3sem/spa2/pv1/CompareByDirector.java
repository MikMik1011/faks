import java.util.Comparator;

public class CompareByDirector implements Comparator<Film> {
    
    public int compare(Film f1, Film f2) {
        return f1.getReditelj().compareTo(f2.getReditelj());
    }
    
}