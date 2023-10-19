//Problem 1722A
package Codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SpellCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<Character> valid = new ArrayList<>(Arrays.asList('T', 'i', 'm', 'u', 'r'));
        ArrayList<String> sol = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            scan.nextLine();
            String s = scan.nextLine();

            boolean status = false;
            for (int j = 0; j < s.length(); j++) {
                if(valid.contains(s.charAt(j))) {
                    status = true;
                }
                else {
                    status = false;
                    break;
                }
            }
            if (status && n == 5) {
                sol.add("YES");
            }
            else
                sol.add("NO");
        }

        for (String s : sol
             ) {
            System.out.println(s);
        }
    }
}
