//Problem 1791A
package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<String> sol = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            char c = scan.next().charAt(0);
            if ("codeforces".contains(Character.toString(c)))
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
