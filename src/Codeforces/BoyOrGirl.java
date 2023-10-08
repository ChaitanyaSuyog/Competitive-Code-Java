//Problem 236A (learnt about LinkedHashSet with this one)
package Codeforces;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = scan.next();

        LinkedHashSet<Character> distinct = new LinkedHashSet<>();
        for (int i = 0; i < username.length(); i++)
            distinct.add(username.charAt(i));

        if (distinct.size() % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
