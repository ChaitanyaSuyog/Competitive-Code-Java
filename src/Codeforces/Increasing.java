//Problem 1742B
package Codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Increasing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<String> sol = new ArrayList<>();

        outer:
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scan.nextInt();
            }
            Arrays.sort(arr);

            if (n == 1) {
                sol.add("YES");
                continue;
            }

            for (int j = 0; j < n - 1; j++) {
                if  (!(arr[j] < arr[j+1])) {
                    sol.add("NO");
                    continue outer;
                }
            }

            sol.add("YES");
        }
        for (String s : sol
             ) {
            System.out.println(s);
        }
    }
}
