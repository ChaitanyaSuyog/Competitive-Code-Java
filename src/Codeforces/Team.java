//Problem 231A
package Codeforces;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        int solvable = 0;
        for (int i = 0; i < n; i++) {
            int ones = 0;
            String current = scan.nextLine();
            for (int j = 0; j < current.length(); j++) {
                if (current.charAt(j) == '1') {
                    ones++;
                }
            }
            if (ones > 1)
                solvable++;
        }
        System.out.println(solvable);
    }
}
