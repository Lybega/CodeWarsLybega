package SevensKyu.CardMask;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.print(maskify(str));
    }
    public static String maskify(String str) {
        if (str.length() > 4){
            String[] arr = str.split("");
            for (int i = arr.length - 5; i >= 0; i--){
                arr[i] = "#";
            }
            return String.join("", arr);
        }
        else return str;
    }

}
