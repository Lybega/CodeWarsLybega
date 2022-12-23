package SevensKyu.GetMid;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
    String a = "abcderfa";
    String b = "najanjsajshb";
    String c = "ndjflaysdbbkjn";
    System.out.println(getMiddle(a));
    }
    public static String getMiddle(String word) {
        String[] str = word.split("");
        List<String> list = new ArrayList<>(List.of(str));
        String answer = "";
         if (list.size() % 2 == 0){
             answer = list.get(list.size() / 2 - 1) + list.get(list.size() / 2);
         }
         else {
             answer = list.get(list.size() / 2);
         }
        return answer;
    }

}