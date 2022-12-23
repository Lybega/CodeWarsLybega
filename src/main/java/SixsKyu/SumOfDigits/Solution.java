package SixsKyu.SumOfDigits;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(digital_root(a));
        System.out.println(other(a));
    }
    public static int digital_root(int n){
        if (String.valueOf(n).length() == 1) return n;
        int sum = n;
        while (String.valueOf(sum).length() > 1){
            sum = reducing(sum);
        }
        return sum;
    }
    public static int reducing (int sum){
        String a = String.valueOf(sum);
        String[] arr = a.split("");
        int b = 0;
        for (String temp:arr) b = b + Integer.parseInt(temp);
        return b;
    }
    public static int other (int n) {
        return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }
}
