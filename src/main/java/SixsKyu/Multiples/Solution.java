package SixsKyu.Multiples;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(solution(a));
    }
    public static int solution (int a){
        int sum = 0;
        if (a < 3) return 0;
        else {
            for (int i = 3; i < a; i++){
                if (i % 3 == 0 || i % 5 == 0)
                    sum += i;
            }
            return sum;
        }
    }
}
