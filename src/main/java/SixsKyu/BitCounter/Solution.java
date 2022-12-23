package SixsKyu.BitCounter;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(countBits(a));
    }
    public static int countBits(int n){
        return Integer.toBinaryString(n).replaceAll("[0]", "").length();
    }
}
