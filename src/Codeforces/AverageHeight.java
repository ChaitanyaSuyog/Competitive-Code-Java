//Problem 1509A (logic is easy)
package Codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AverageHeight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            ArrayList<Integer> heights = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();
            ArrayList<Integer> even = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                heights.add(scan.nextInt());
            }
            for (int h : heights
                 ) {
                if (h % 2 == 0)
                    even.add(h);
                else
                    odd.add(h);
            }
            Collections.sort(odd);
            Collections.sort(even);

            printArr(odd, even);
        }
    }
    public static void printArr(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        for (int i : arr1
             ) {
            System.out.print(i + " ");
        }
        for (int i : arr2
             ) {
            System.out.print(i + " ");
        }
    }
}
