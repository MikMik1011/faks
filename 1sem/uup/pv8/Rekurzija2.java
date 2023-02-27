package pv8;

import org.svetovid.Svetovid;

public class Rekurzija2 {


    private static int readN() {
        int n;
        do {
            n = Svetovid.in.readInt("Unesite n:");
        } while (n < 0 || n > 25);

        return n;
    }

    private static int readR() {
        int r;
        do {
            r = Svetovid.in.readInt("Unesite r:");
        } while (r < 5 || r > 20);

        return r;
    }

    private static int f_def(int n, int r) {
        if (n >= r) {
            if (n % 5 == 0) return Math.abs(f_def(n - r, r) - g_def(n - 1, r));
            else return -g_def(n - 3, r) + f_def(n - 1, r);
        }
        else return 3 * r - 2;
    }

    private static int g_def(int n, int r) {
        if (n >= r) {
            int nr = n + r;
            if (nr % 6 == 0) return g_def(n - r, r) + (f_def(n - 2, r) * g_def(n - r + 1, r));
            else if (nr % 6 == 1) return f_def(n - r, r) + (g_def(n - 2, r) * f_def(n - r + 1, r));
            else return Math.max(f_def(n - r + 2, r), g_def(n - r + 1, r));
        }
        else return (int) (Math.pow(-1, n) - n);
    }

    private static int iter(int n, int r) {
        int[] f = new int[n];
        int[] g = new int[n];

        for (int i = 0; i < n; ++i) {
            // f
            if (n >= r) {
                if (n % 5 == 0) f[i] = Math.abs(f[n - r] - g[n - 1]);
                else f[i] = -g[n - 3] + f[n - 1];
            }
            else f[i] = 3 * r - 2;

            // g
            if (n >= r) {
                int nr = n + r;
                if (nr % 6 == 0) g[i] = g[n - r] + f[n - 2] * g[n - r + 1];
                else if (nr % 6 == 1) g[i] = f[n - r] + g[n - 2] * f[n - r + 1];
                else g[i] = Math.max(f[n - r + 2], g[n - r + 1]);
            }
            else g[i] = (int) (Math.pow(-1, n) - n);

        }

        return f[n];
        
    }

    private static void test(int n, int r, int expected) {
        Svetovid.out.println("Test case: n = " + n +  ", r = " + r + ", expected = " + expected);

        int def = f_def(n, r);
        Svetovid.out.println("Def: returned " + def + ", passed: " + (def == expected));

        int iterResult = f_def(n, r);
        Svetovid.out.println("Acc: returned " + iterResult + ", passed: " + (iterResult == expected));

        Svetovid.out.println();
    }

    public static void main(String[] args) {
        test(7, 5, 23);
        test(25, 10, 451);
        test(17, 5, 3374);
    }
}
