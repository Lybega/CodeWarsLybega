package EightKyu.StringToInteger;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(stringToNumber(str));
    }
    public static int stringToNumber(String str){
        int a = Integer.parseInt(str);
        return a;
    }
}
