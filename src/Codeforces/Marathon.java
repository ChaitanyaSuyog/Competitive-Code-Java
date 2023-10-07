//Problem 1692A
package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] distances = new int[4];
        ArrayList<Integer> sol = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int noAhead = 0;
            for (int j = 0; j < 4; j++) {
                distances[j] = scan.nextInt();
            }
            for (int d : distances
                 ) {
                if(distances[0] < d)
                    noAhead++;
            }
            sol.add(noAhead);
        }

        for (int s : sol
             ) {
            System.out.println(s);
        }
    }
}
