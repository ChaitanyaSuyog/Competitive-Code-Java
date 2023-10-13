//Problem 1743A (actually for the first time found some use for sets xD)
package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<Integer> sol = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int noAbsent = scan.nextInt();
            scan.nextLine();
            scan.nextLine();
            //Since total no. of digits = 10, no. present will be
            int noPresent = 10 - noAbsent;
            /*There will be 6 possible permutations for each set of two distinct numbers
              To figure this out you can either do it by just writing down the combinations,
              or use the permutation formula nPr (here -> 4!/(4-2)! = 24/4 = 6).
             */
            sol.add(suitableSubsets(noPresent) * 6);
        }
        for (int s : sol) {
            System.out.println(s);
        }
    }
    public static int suitableSubsets(int size) {
        int noOfSubs = 0;
        /*Obtained the below formula by using cartesian product of a set with itself
          and removing (i)ordered pairs having same element and (ii)repeated ordered pairs.
         */
        for (int i = 1; i < size; i++) {
            noOfSubs += (size - i);
        }
        return noOfSubs;
    }
}
