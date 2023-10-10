//Problem 1619A
package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class SquareString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        ArrayList<String> sol = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String str = scan.nextLine();

            if (str.length() % 2 != 0)
                sol.add("NO");
            else {
                String sub1 = str.substring(0, (str.length() / 2));
                String sub2 = str.substring(str.length() / 2);
                if (sub1.equals(sub2))
                    sol.add("YES");
                else
                    sol.add("NO");
            }
        }
        for (String s : sol
             ) {
            System.out.println(s);
        }
    }
}
