//Problem 282A
package Codeforces;

import java.util.Scanner;

public class Bitland {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        int x = 0;
        for (int i = 0; i < n; i++) {
            String stmt = scan.nextLine();
            if (stmt.contains("+")) {
                x++;
            }
            else {
                x--;
            }
        }
        System.out.println(x);
    }
}
