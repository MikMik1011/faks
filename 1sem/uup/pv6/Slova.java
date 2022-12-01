package pv6;

import java.util.Arrays;

import org.svetovid.Svetovid;

public class Slova {

    private static char[] getUniqueChars(String s) {
        char[] uniqueArr = new char[s.length()];
        int uniqueCount = 0;

        stringIter : for(int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            for(int j = 0; j < uniqueCount; ++j) {
                if (c == uniqueArr[j]) continue stringIter;
            }

            uniqueArr[uniqueCount] = c;
            ++uniqueCount; 
        }

        return Arrays.copyOfRange(uniqueArr, 0, uniqueCount);
    }

    private static void printUnique(String s, char[] charArr) {
        for(int i = 0; i < charArr.length; ++i) {
            char c = charArr[i];

            Svetovid.out.print(c + ": ");
            
            for(int j = 0; j < s.length(); ++j) {
                if(s.charAt(j) == c) Svetovid.out.print("* ");
            }

            Svetovid.out.print("\n");
        }
    }

    public static void main(String[] args) {
        String s = Svetovid.in.readLine("Unesite rec:");
        char[] slova = getUniqueChars(s);

        printUnique(s, slova);
    }
}
