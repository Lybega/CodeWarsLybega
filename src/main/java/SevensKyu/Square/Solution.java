package SevensKyu.Square;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(isSquare(a));

    }
    public static boolean isSquare(int n) {
        boolean answer;
        if (Math.sqrt(n) % 1.0 == 0)
            answer = true;
        else answer = false;
        return answer; // fix me!
    }
}
