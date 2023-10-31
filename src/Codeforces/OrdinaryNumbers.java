//Problem 1520B
package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class OrdinaryNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<Long> sol = new ArrayList<>();

        for (int j = 0; j < t; j++) {
            long n = scan.nextInt();

            long start, count = 0;
            for (int i = 1; i <= 9; i++)
            {
                start = i;
                while (start <= n)
                {
                    count++;
                    start = (start * 10) +i;
                }
            }
            sol.add(count);
        }
        for (long s : sol
             ) {
            System.out.println(s);
        }
    }
}
