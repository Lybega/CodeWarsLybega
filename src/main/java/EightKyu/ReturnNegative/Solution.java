package EightKyu.ReturnNegative;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.println(makeNegative(x));

    }
    public static int makeNegative(final int x) {
        int a = x;
        if (x > 0){
            a = x * -1;
        }
        return a; // Your code here.
    }
}
