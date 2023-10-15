//Problem 1702B (toughest one yet, my logic initially had many loopholes)
package Codeforces;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class StringFromMemory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        ArrayList<Integer> sol = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String s = scan.nextLine();

            LinkedHashSet<Character> distinct = new LinkedHashSet<>();

            int days = 0;
            for (int j = 0; j < s.length(); j++) {
                distinct.add(s.charAt(j));
                if (distinct.size() > 3) {
                    distinct.clear();
                    distinct.add(s.charAt(j));
                    days++;
                }
                if (distinct.size() <= 3 && j == s.length() - 1) {
                    days++;
                }
            }
            sol.add(days);
        }
        for (int s : sol
             ) {
            System.out.println(s);
        }
    }
}
