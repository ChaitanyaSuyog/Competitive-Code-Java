//Problem 1371A
package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class MagicalSticks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<Integer> sol = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int noOfSticks = (int) Math.ceil(n / 2.0);
            sol.add(noOfSticks);
        }
        for (int s : sol
             ) {
            System.out.println(s);
        }
    }
}
