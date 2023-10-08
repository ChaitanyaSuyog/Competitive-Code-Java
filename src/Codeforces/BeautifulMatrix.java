//Problem 263A (first time I'm using 2D arrays, I know, superb problem honestly)
package Codeforces;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Scanner scan = new Scanner(System.in);

        int x = 0, y = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scan.nextInt();
                if (matrix[i][j] == 1) {
                    x = i;
                    y = j;
                }
            }
        }
        //How many column swaps are required
        int cSwap = Math.abs(x - 2);
        //How many row swaps are required
        int rSwap = Math.abs(y - 2);
        //(2,2) is the ideal position, hence 2 is the subtrahend

        System.out.println(cSwap + rSwap);
    }
}
