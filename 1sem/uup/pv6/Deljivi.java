package pv6;

import org.svetovid.Svetovid;

public class Deljivi {
    
    private static int readDim() {
        int n;

        do {
            n = Svetovid.in.readInt("Unesite dimenziju niza:");
        } while(n < 1);

        return n;
    }

    private static void fillArr(int[] arr, String name) {
        for(int i = 0; i < arr.length; ++i) {
            arr[i] = Svetovid.in.readInt("Unesite " + i + " element niza " + name + ":");
        }
    }

    private static void checkMod(int[] a, int[] b) {
        for(int i : a) {
            for(int j : b) {
                if (i % j == 0) Svetovid.out.println(i + ", " + j);
            }
        }
    }
    public static void main(String[] args) {
        int dim = readDim();
        int[] a = new int[dim];
        int[] b = new int[dim];

        fillArr(a, "a");
        fillArr(b, "b");

        checkMod(a, b);

    }
}
