package SevensKyu.DisemvowelTrolls;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String badComment = s.nextLine();
        System.out.println(disemVowel(badComment));
    }
    public static String disemVowel(String badComment) {
        String[] vowels = new String[] {"a", "e", "i", "o", "u"};
        String[] arrayBadComment = badComment.split("");
        ArrayList<String> badCommentList = new ArrayList<String>(Arrays.asList(arrayBadComment));
        for (int i = arrayBadComment.length - 1; i >= 0; i--){
            for (int j = 0; j < vowels.length; j++){
                if (arrayBadComment[i].equalsIgnoreCase(vowels[j])){
                    badCommentList.remove(i);
                }
            }
        }
        String str = String.join("", badCommentList);
        return str;
    }
}
