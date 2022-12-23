package SevensKyu.Mumbling;


public class Solution {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "AbcdjHu";
        String c = "ZpglnRxqenU";
        System.out.println(accum(c));
    }
    public static String accum(String s) {
        String[] str = s.split("");
        StringBuilder answer = new StringBuilder();
        int count = 0;
        answer = new StringBuilder(str[0].toUpperCase());
        for (int i = 1; i < str.length; i++) {
            answer.append("-");
            for (int j = i; j >= 0; j--){
                if (j == i) answer.append(str[i].toUpperCase());
                else answer.append(str[i].toLowerCase());
            }
        }
        return answer.toString();
    }
}
