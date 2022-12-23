package SevensKyu.Isogram;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(isIsogram(str));
    }

    public static boolean  isIsogram(String str) {
        boolean answer = true;
        String a = str.toLowerCase();
        String[] strArr = a.split("");
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(strArr));
        Collections.sort(strList);
        for (int i = 0; i < strList.size() - 1; i++) {
            int j = i + 1;
            answer = !strList.get(i).equalsIgnoreCase(strList.get(j));
            if (!answer) break;
        }
        return answer;

    }
}
