//Problem 1703B
package Codeforces;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ICPCBalloons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<Integer> sol = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            scan.nextLine();
            String solved = scan.nextLine();

            LinkedHashSet<Character> distinct = new LinkedHashSet<>();
            for (char c : solved.toCharArray()
                 ) {
                distinct.add(c);
            }
            sol.add(n + distinct.size());
        }

        for (int s : sol
             ) {
            System.out.println(s);
        }

    }
}
