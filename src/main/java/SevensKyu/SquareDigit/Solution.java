package SevensKyu.SquareDigit;


import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(squareDigits(n));
    }
    public static int squareDigits(int n) {
        String a = String.valueOf(n);
        String[] firstArray = a.split("");
        String result = "";
        for (int i = 0; i < firstArray.length; i++){
            result = result + (int)(Math.pow((double)(Integer.parseInt(firstArray[i])), 2));
        }
        int answer = Integer.parseInt(result);
        return answer;
        // TODO Implement me
    }
}
