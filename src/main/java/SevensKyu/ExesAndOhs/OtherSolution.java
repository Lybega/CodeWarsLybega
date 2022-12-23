package SevensKyu.ExesAndOhs;

import java.util.List;

public class OtherSolution {
    public static void main(String[] args) {
        List<String> list = List.of("xoxoxo", "OXOXkk", "anchcgb", "OOO");
        System.out.println(getXO(list.get(0)));
    }
    public static boolean getXO (String str) {
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();

    }


}
