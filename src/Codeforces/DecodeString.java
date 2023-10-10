//Problem 1729B (tough, took me 2 days to figure out the logic)
package Codeforces;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class DecodeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<String> sol = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            BigInteger encoded = scan.nextBigInteger();

            sol.add(decodeString(encoded));
        }
        for (String s : sol
             ) {
            System.out.println(s);
        }
    }
    public static String decodeString(BigInteger encoded) {
        BigInteger currentFromLast;
        String decodedR = "";
        while(encoded.signum() != 0) {
            currentFromLast = encoded.mod(BigInteger.valueOf(10));

            if (currentFromLast.signum() == 0) {
                encoded = encoded.divide(BigInteger.valueOf(10));
                decodedR += Character.toString((char) (encoded.mod(BigInteger.valueOf(100)).intValue() + 96));
                encoded = encoded.divide(BigInteger.valueOf(100));
            }
            else {
                decodedR += Character.toString((char) (currentFromLast.intValue() + 96));
                encoded = encoded.divide(BigInteger.valueOf(10));
            }
        }
        //Reverse decoded string
        StringBuilder decoded = new StringBuilder();
        decoded.append(decodedR);

        return decoded.reverse().toString();
    }
}
