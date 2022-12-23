package SevensKyu.SumOfNumbers;

import java.util.Scanner;

public class Other {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(GetSum(a, b));
    }
    public static int GetSum(int a, int b){
        int sum = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++){
            sum += i;
        }
        return a == b ? a : sum;
    }
}
