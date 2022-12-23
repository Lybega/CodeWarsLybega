package SevensKyu.DisemvowelTrolls;

import java.util.Scanner;

public class SimplerSolution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String badComment = s.nextLine();
        System.out.println(disemVowel(badComment));
    }

    public static String disemVowel(String str) {
        return str.replaceAll("[AaEeiIoOuU]" , ""); // return Z.replaceAll("(?i)[aeiou]" , "");
    }

}
