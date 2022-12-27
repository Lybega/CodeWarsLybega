package SevensKyu.BinaryAddition;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(binaryAddition(a, b));
    }
    public static String binaryAddition(int a, int b){
        String s = (Integer.toBinaryString(a + b));
        return s;
    }
    /*
    int sum = a + b;
         int bit;
         String result = "";
         while (sum != 0) {
             bit = sum % 2;
             result = bit + result;
             sum = sum / 2;
         }
         return result;
     */
}
