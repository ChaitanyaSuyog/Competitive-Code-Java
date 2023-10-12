//Problem 1372A
// Figured out printing a single integer immediately, but wanted to try random ones.
// I wasn't able to solve it that way though.
package Codeforces;

import java.util.Scanner;

public class OmkarAndCompletion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] terms = new int[t];

        for(int i = 0; i < t; i++) {
            terms[i] = scan.nextInt();
        }
        for(int n : terms) {
            for(int i = 0; i < n; i++)
                System.out.print(1 + " ");
            System.out.println();
        }
    }
}