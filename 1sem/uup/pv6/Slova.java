package pv6;

import org.svetovid.Svetovid;

public class Slova {

    public static void main(String[] args) {
        String s = Svetovid.in.readLine("Unesite rec: ");
        char[] slova = new char[s.length()];
        int uniqueCount = 0;

        for(int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            boolean unique = true;
            for(int j = 0; j < uniqueCount; ++j) {
                if (c == slova[j]) unique = false;
            }
            if(unique) {
                slova[uniqueCount] = c;
                ++uniqueCount; 
            }
        }

        for(int i = 0; i < uniqueCount; ++i) {
            char c = slova[i];
            Svetovid.out.print(c + ": ");
            for(int j = 0; j < s.length(); ++j) {
                if(s.charAt(j) == c) Svetovid.out.print("* ");
            }
            Svetovid.out.print("\n");
            
        }
    }
}
