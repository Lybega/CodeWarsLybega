package SixsKyu.SpiningWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        String str = "My name is AbdulamDanyBOby so its difficult to pronounce";
        System.out.println(spinWords(str));
    }
    public static String spinWords(String sentence) {
        String[] str = sentence.split("\\s");
        for (int i = 0; i < str.length; i++){
            if (str[i].length() > 4){
                String[] arr = str[i].split("");
                ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
                Collections.reverse(list);
                str[i] = String.join("",list);
                }
            }
        return String.join(" ", str);
    }
    public String other(String sentence) {
        String[] words = sentence.split(" ");
        for (int i=0; i<words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ",words);
    }
}
