//Problem 1882A
package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class IncreasingSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<Integer> sol = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            ArrayList<Integer> given = new ArrayList<>();
            ArrayList<Integer> good = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                given.add(scan.nextInt());
            }
            for (int j = 0, k = 1; j < n; j++) {
                if (k != given.get(j) && !good.contains(k)) {
                    good.add(k);
                }
                else {
                    good.add(++k);
                }
                k++;
            }
            sol.add(good.getLast());
        }

        for (int s : sol
             ) {
            System.out.println(s);
        }
    }
}
