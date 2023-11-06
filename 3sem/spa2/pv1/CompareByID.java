import java.util.Comparator;

public class CompareByID implements Comparator<Film> {
    
    public int compare(Film f1, Film f2) {
        return f1.getId() - f2.getId();
    }
    
}