//Problem 711A
package Codeforces;

import java.util.Scanner;

public class BusToUdayland {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] rows = new String[n];
        boolean available = false;

        for (int i = 0; i < n; i++) {
            rows[i] = scan.next();
        }

        OUTER:
        for (int i = 0; i < rows.length; i++) {
            StringBuilder rowSB = new StringBuilder(rows[i]);
            for (int j = 0; j < rows[i].length()-1; j++) {
                if (rows[i].charAt(j) == rows[i].charAt(j+1) && rows[i].charAt(j) == 'O') {
                    rowSB.setCharAt(j, '+');
                    rowSB.setCharAt(j+1, '+');
                    rows[i] = rowSB.toString();
                    available = true;
                    break OUTER;
                }
            }
        }

        if (available) {
            System.out.println("YES");
            for (String row : rows)
                System.out.println(row);
        }
        else
            System.out.println("NO");
    }
}
