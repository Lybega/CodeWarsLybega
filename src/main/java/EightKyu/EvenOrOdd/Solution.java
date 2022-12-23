package EightKyu.EvenOrOdd;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.print(even_or_odd(number));
    }
        public static String even_or_odd(int number) {
        String answer = "";
        answer = (number % 2 == 0) ? "Even" : "Odd";
    return answer;
    }
}
