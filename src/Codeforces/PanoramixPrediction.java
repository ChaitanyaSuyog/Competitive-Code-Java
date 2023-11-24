//Problem 80A - Learnt about nextProbablePrime()

package Codeforces;

import java.math.BigInteger;
import java.util.Objects;
import java.util.Scanner;

public class PanoramixPrediction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger n = BigInteger.valueOf(scan.nextInt());
        BigInteger m = BigInteger.valueOf(scan.nextInt());

        if (Objects.equals(n.nextProbablePrime(), m))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
