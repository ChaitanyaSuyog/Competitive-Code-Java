//Problem 1829A
package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        ArrayList<Integer> sol = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            //String str = scan.next();
            char[] s = scan.nextLine().toCharArray();
            char[] c = {'c','o','d','e','f','o','r','c','e','s'};

            int indices = 0;
            for (int j = 0; j < 10; j++) {
                if(s[j] != c[j])
                    indices++;
            }
            sol.add(indices);
        }

        for (int s : sol
             ) {
            System.out.println(s);
        }
    }
}
