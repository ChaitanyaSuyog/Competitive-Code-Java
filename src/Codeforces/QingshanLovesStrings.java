//Problem 1890B
package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class QingshanLovesStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        ArrayList<String> sol = new ArrayList<>();

        outer:
        for (int i = 0; i < T; i++) {
            int n = scan.nextInt();
            scan.nextLine();
            String s = scan.nextLine();
            String t = scan.nextLine();
            String good = "";

            for (int j = 0; j < n - 1; j++) {
                good += s.charAt(j);
                if (s.charAt(j) == s.charAt(j + 1)) {
                    good += t;
                }
                if (j == n - 2)
                    good += s.charAt(n - 1);
            }

            if (s.equals(good)) {
                sol.add("Yes");
            }
            else {
                for (int j = 0; j < good.length() - 1; j++) {
                    if (good.charAt(j) == good.charAt(j + 1)) {
                        sol.add("No");
                        continue outer;
                    }
                }
                sol.add("Yes");
            }
        }
        for (String soln : sol
        ) {
            System.out.println(soln);
        }
    }
}
