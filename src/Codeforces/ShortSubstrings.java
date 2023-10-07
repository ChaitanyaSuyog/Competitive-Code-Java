//Problem 1367A (tough one)
package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class ShortSubstrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  t = scan.nextInt();
        scan.nextLine();

        ArrayList<String> sol = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String given = scan.nextLine();
            String sub1, sub2, newStr = "";

            while (given.length() > 2) {
                if (given.length() % 2 == 0) {
                    sub1 = given.substring(0, 2);
                    sub2 = given.substring(2, 4);
                    if (sub1.charAt(1) == sub2.charAt(0)) {
                        newStr += sub1 + sub2.charAt(1);
                        given = given.substring(3);
                    }
                }
                else {
                    if (given.charAt(0) == given.charAt(1)) {
                        newStr += given.charAt(2);
                        given = given.substring(2);
                    }
                }
            }
            if (given.length() == 2) {
                newStr += given;
            }
            sol.add(newStr);
        }

        for (String str : sol
             ) {
            System.out.println(str);
        }
    }
}
