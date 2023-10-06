//Problem 158A
package Codeforces;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] allScores = new int[n];
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            allScores[i] = scan.nextInt();
        }
        int c = 0;
        for (int score : allScores
        ) {
            if (score >= allScores[k-1] && score > 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}
