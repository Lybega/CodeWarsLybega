package SixsKyu.PlayingWithDigits;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(digPow(a, b));
    }

    public static int digPow(int a, int b) {
        char[] c = String.valueOf(a).toCharArray();
        int sum = 0;
        int temp ;
        for (int i = 0; i < c.length; i++) {
            double current = Integer.parseInt(String.valueOf(c[i]));
            temp = (int) Math.pow(current, b);
            sum = sum + temp;
            b++;
        }
        int last = sum % a;
        if (last == 0)
        return (sum / a);
        else return -1;
    }
    /*
    public static long digPow(int n, int p) {
    String intString = String.valueOf(n);
    long sum = 0;
    for (int i = 0; i < intString.length(); ++i, ++p)
      sum += Math.pow(Character.getNumericValue(intString.charAt(i)), p);
    return (sum % n == 0) ? sum / n : -1;
	}
     */
}
