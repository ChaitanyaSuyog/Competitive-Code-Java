//Problem 1722B
package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Colourblindness {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<String> sol = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            scan.nextInt();
            scan.nextLine();

            String a = scan.nextLine();
            String b = scan.nextLine();
            a = a.replaceAll("G", "B");
            b = b.replaceAll("G", "B");

            if (a.equals(b))
                sol.add("YES");
            else
                sol.add("NO");
        }

        for (String s : sol
             ) {
            System.out.println(s);
        }
    }
}
