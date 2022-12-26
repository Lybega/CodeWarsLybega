package EightKyu.VowelRemover;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.print(shortcut(input));
    }
    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }
    /* public static String shortcut(String input) {
        char[] a = new char[]{'a', 'e', 'i', 'o', 'u'};
        int arrLength = a.length;
        StringBuilder c = new StringBuilder();
        int i;
        boolean b;
        for (i = 0; i < input.length(); i++) {
            b = true;
            for (int j = 0; j < arrLength; j++) {
                if (input.charAt(i) != a[j] && b)
                    continue;
                else b = false;
            }
            if (b == true) c.append(input.charAt(i));
        }
        return c.toString();
    }*/
}


