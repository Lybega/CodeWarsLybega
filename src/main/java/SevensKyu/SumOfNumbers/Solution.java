package SevensKyu.SumOfNumbers;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(GetSum(a, b));
    }
    public static int GetSum(int a, int b) {
        int sum = 0;
        if (a == b) return a;
        else {
            int first = Math.min(a, b);
            int last = Math.max(a, b);
            int arrLength = 0;
            if (first < 0)
                arrLength = last + first * (-1) + 1;
            if (last <= 0)
                arrLength = first * (-1) - last * (-1)  + 1;
            else
                arrLength = last - first + 1;
            int[] arr = new int[arrLength];
            arr[0] = first;
            arr[arrLength - 1] = last;
            for (int i = 1; i < arr.length - 1; i++)
                arr[i] = arr[0] + i;
            for (int temp:arr){
                sum = sum + temp;
            }
        }
        return sum;
    }
}
