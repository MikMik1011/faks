package pv7;

import org.svetovid.Svetovid;

public class Rekurzija {

    private static int readN() {
        int n;
        do {
            n = Svetovid.in.readInt("Unesite n:");
        } while (n < 0 || n > 42);

        return n;
    }
    
    private static int calcElemDef(int i) {
        switch(i) {
            case 0: return 1;
            case 1: return 3;
            case 2: return 2;
            case 3: return 1;
            
        }

        if (i % 10 >= 5) return calcElemDef(i - 1) + calcElemDef(i - 3) - 2 * calcElemDef(i - 4);
        else return 3 * calcElemDef(i - 1) - calcElemDef(i - 2) - calcElemDef(i - 4);
        
    }
    

    private static int accumParam(int f3, int f2, int f1, int f0, int i, int n) {

        if (i > n) return f3;
        switch(i) {
            case 0: return 1;
            case 1: return 3;
            case 2: return 2;
            case 3: return 1;
            
        }

        if (i % 10 >= 5) return accumParam(f3 + f1 - 2 * f0, f3, f2, f1, i+1, n);
        else return accumParam(3 * f3 - f2 - f0, f3, f2, f1, i+1, n);
    }

    private static int calcElemAcc (int n) {
        return accumParam(1, 2, 3, 1, 4, n);
    }



    public static void main(String[] args) {
        int n = readN();

        Svetovid.out.print("Definicija: ");
        for (int i = 0; i < n; ++i) {
            Svetovid.out.print(calcElemDef(i)+ ", ");
        }

        Svetovid.out.print("\nAkumulirajuci: ");
        for (int i = 0; i < n; ++i) {
            Svetovid.out.print(calcElemAcc(i)+ ", ");
        }

        
    
    }
}
