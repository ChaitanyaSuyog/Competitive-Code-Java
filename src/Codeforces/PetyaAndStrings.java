//Problem 112A (very easy, especially with Java's methods)
package Codeforces;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next().toLowerCase();
        String b = scan.next().toLowerCase();
        /*Using signum function f(x) =  {1   x>0
                                         0   x=0
                                        -1   x<0
         */
        System.out.println((int) Math.signum(a.compareTo(b)));
    }
}
