package SixsKyu.Duplicates;


import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println(duplicateCount(a));
    }
    public static int duplicateCount(String text) {
        int answer = 0;
        for (int i = 0; i < text.length(); i++) {
            char temp = text.toLowerCase().charAt(i);
            if (Pattern.compile("\\W").matcher(String.valueOf(temp)).matches()) continue;
            int count = (int) text.toLowerCase().chars().filter(ch -> ch == temp).count();
            if (count > 1){
                text = text.replaceAll(String.valueOf(temp), "!");
                answer++;
            }
        }
        return answer;
    }
}
