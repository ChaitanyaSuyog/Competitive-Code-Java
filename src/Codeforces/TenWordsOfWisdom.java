package Codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TenWordsOfWisdom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<Integer> winningResponse = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int[] qualities = new int[50];

            //Input no of words and quality
            for (int j = 0; j < n; j++) {
                int a = scan.nextInt();
                if (a > 10) {
                    scan.nextInt();
                    qualities[j] = 0;
                    continue;
                }
                qualities[j] = scan.nextInt();
            }
            int max = Arrays.stream(qualities).max().getAsInt();

            for (int j = 0; j < qualities.length; j++) {
                if (qualities[j] == max) {
                    winningResponse.add(j+1);
                    break;
                }
            }
        }

        for (int r : winningResponse
             ) {
            System.out.println(r);
        }
    }
}
