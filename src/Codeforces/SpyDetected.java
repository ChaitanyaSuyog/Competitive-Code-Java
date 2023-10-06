//Problem 1512A
package Codeforces;

import java.util.Scanner;

public class SpyDetected {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int n;
        String op = "";
        for (int i = 0; i < t; i++) {
            n = scan.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scan.nextInt();
            }
            op = op.concat(getIndex(arr) + "\n");
        }
        System.out.println(op);
    }
    public static int getIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 2) {
                if (arr[i] != arr[i + 1]) {
                    if (arr[i] != arr[i + 2])
                        return ++i;
                    else
                        return i + 2;
                }
            }
            else {
                if (arr[i] != arr[i - 1]) {
                    if (arr[i] != arr[i - 2])
                        return ++i;
                }
                else
                    return i + 2;
            }
        }
        return 0;
    }
}
