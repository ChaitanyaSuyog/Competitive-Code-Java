package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class OrdinaryNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<Integer> sol = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int noOfOrdinary;
            int cM;

            if (n < 10)
                noOfOrdinary = n;
            else if (n == 10)
                noOfOrdinary = 9;
            else {
                cM = closestMultiple(n);
                noOfOrdinary = 9 + (cM / 11);
            }
            sol.add(noOfOrdinary);
        }
        for (int s : sol
             ) {
            System.out.println(s);
        }
    }
    public static int closestMultiple(int n) {
        n = n + (11 / 2);
        n = n - (n % 11);
        return n;
    }
}
