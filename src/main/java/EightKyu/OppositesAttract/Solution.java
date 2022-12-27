package EightKyu.OppositesAttract;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(isLove(a, b));
    }
    public static boolean isLove(int a, int b){
        return (a + b) % 2 == 1;
        //flower1 % 2 != flower2 % 2;
    }
}
