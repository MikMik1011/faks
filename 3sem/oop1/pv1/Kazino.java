import java.util.Arrays;

public class Kazino {
    private Kladionicar[] kladionicari;

    public Kazino(Kladionicar[] kladionicari) {
        this.kladionicari = kladionicari;
    }

    private int findIndexOfMaximum(int[] array) {
        int maxIndex = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > array[maxIndex])
                maxIndex = i;
        }
        return maxIndex;
    }

    public String najprofitablinijaIgra() {
        String[] igre = { "poker", "ajnc", "rulet" };
        int[] stanja = { 0, 0, 0 };
        for (Kladionicar k : kladionicari) {
            if (k.getStanje() > 0)
                continue;

            stanja[Arrays.asList(igre).indexOf(k.getImeIgre())]++;
        }
        String najprofitabilnija = igre[findIndexOfMaximum(stanja)];
        return String.format("Najprofitabilnija igra je trenutno je %s.", najprofitabilnija);
    }

    @Override
    public String toString() {
        String result = "";
        for (Kladionicar k : kladionicari)
            result += k + "\n";
        return result;
    }

}
