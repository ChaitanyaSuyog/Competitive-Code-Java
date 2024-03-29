//Problem 472A
package Codeforces;

import java.util.Scanner;

public class DesignTutorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x, y;

        for (int i = 2; i < n; i++) {
            if (isNotPrime(i) && isNotPrime(n-i)) {
                System.out.println(i + " " + (n-i));
                break;
            }
        }
    }
    public static boolean isNotPrime(int n)
    {
        if (n <= 1)
            return true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return true;
        }
        return false;
    }
}
