package EightKyu.ReversedStrings;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println(reverse(a));
    }
    public static String reverse (String a){
        StringBuilder b = new StringBuilder();
        b.append(a);
        b.reverse();
        return b.toString();
    }
}
