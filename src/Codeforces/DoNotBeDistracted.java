//Problem 1520 (took me quite a while, some small details and conditions can easily be missed)
package Codeforces;


import java.util.Scanner;

public class DoNotBeDistracted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int n;
        String progress, sol = "";

        for (int i = 0; i < t; i++) {
            n = scan.nextInt();
            scan.nextLine();
            progress = scan.next();
            progress = removeDupes(progress);
            if (checkRepetition(progress))
                sol += "NO" + "\n";
            else
                sol += "YES" + "\n";
        }
        System.out.println(sol);
    }

    //This method will remove any consecutive duplicates e.g "AABB" -> "AB"
    public static String removeDupes(String str) {
        if (str.length() <= 1)
            return str;
        if (str.charAt(0) == str.charAt(1))
            return removeDupes(str.substring(1));
        else
            return str.charAt(0) + removeDupes(str.substring(1));
    }

    /*This method just checks if any repetitions occur. Obviously if they occur in a string with no consecutive duplicates,
      it must mean that the repetitions take place with some OTHER characters between them. Hence, we can prove Polycarp has
      been performing some other tasks in between.
    */
    public static boolean checkRepetition(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j)
                    return true;
            }
        }
        return false;
    }
}
