//Problem 71A
package Codeforces;

import java.util.Scanner;

public class LongWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.next();
            int l = arr[i].length();
            if (l>10) {
                arr[i] = arr[i].charAt(0) + Integer.toString(l-2) + arr[i].charAt(l-1);
            }
        }
        for (String s : arr
        ) {
            System.out.println(s);
        }
    }
}
