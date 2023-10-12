//Problem 1878A
package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class DaytonaCost {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<String> sol = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            scan.nextLine();
            boolean present = false;

            for (int j = 0; j < n; j++) {
                if (scan.nextInt() == k)
                    present = true;
            }
            if (present)
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
