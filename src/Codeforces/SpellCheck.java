//Problem 1722A
package Codeforces;

import java.util.*;
public class SpellCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<String> sol = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            scan.nextLine();
            String s = scan.nextLine();
            ArrayList<Character> valid = new ArrayList<>(Arrays.asList('T', 'i', 'm', 'u', 'r'));

            boolean status = false;
            for (int j = 0; j < s.length(); j++) {
                if(valid.contains(s.charAt(j))) {
                    //Remove element
                    Iterator<Character> itr = valid.iterator();
                    while (itr.hasNext()) {
                        if (itr.next() == s.charAt(j))
                            itr.remove();
                    }
                    status = true;
                }
                else {
                    status = false;
                    break;
                }
            }
            if (status && s.length() == 5) {
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
