package SevensKyu.ExesAndOhs;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> list = List.of("xoxoxo", "OXOXkk", "anchcgb", "OOO");
        System.out.println(getXO(list.get(0)));
    }
    public static boolean getXO (String str){
        String[] arr = str.split("");
        StringBuilder x = new StringBuilder();
        StringBuilder o = new StringBuilder();
        for (String b : arr) {
            if (b.equalsIgnoreCase("x"))
                x.append(b);
            if (b.equalsIgnoreCase("o"))
                o.append(b);
        }
        return (x.length() == o.length());
    }
}
