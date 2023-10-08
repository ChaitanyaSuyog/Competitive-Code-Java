//Problem 546A
package Codeforces;

import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        int w = scan.nextInt();

        //Using the formula for arithmetic progression, since cost is in A.P (k, 2k, 3k, 4k... wk)
        int totalCost = (w * ((2*k) + (w-1)*k)) / 2;
        int deficit = totalCost - n;
        if (deficit > 0)
            System.out.println(deficit);
        else
            System.out.println("0");
    }
}
