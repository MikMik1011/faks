package pv6;

import org.svetovid.Svetovid;

public class Matrica {
    
    private static int readDim() {
        int n;

        do {
            n = Svetovid.in.readInt("Unesite dimenziju matrice (<20):");
        } while(n < 1 || n >= 20);

        return n;
    }

    private static void fillMat(int[][] matrix) {
        for(int i = 0; i < matrix.length; ++i) {
            for(int j = 0; j < matrix.length; ++j) {
                matrix[i][j] = Svetovid.in.readInt("Unesite element matrice na " + i + ", " + j + ":");
            }
        }
    }

    private static boolean checkSim(int[][] matrix) {
        for(int i = 0; i < matrix.length; ++i) {
            for(int j = 0; j < i; ++j) {
                if (matrix[i][j] != matrix[j][i]) return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        int dim = readDim();

        int[][] matrix = new int[dim][dim];

        fillMat(matrix);

        if(checkSim(matrix)) Svetovid.out.println("Matrica je simetricna!");
        else Svetovid.out.println("Matrica nije simetricna!");
    }
}
