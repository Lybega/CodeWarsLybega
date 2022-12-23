package SevensKyu.ShortestString;

public class Solution {
    public static void main(String[] args) {
        String s = "Bitcoin - take over the a world's! Maybe, who knows? Perhaps.";
        System.out.println(shortest(s));
    }
    public static int shortest(String str){
        String[] arr = str.split("\\s*(\\s|,|-|!|\\.|\\?)\\s*");
        int answer = Integer.MAX_VALUE;
        for (String temp : arr){
            answer = Math.min(temp.length(), answer);
        }
    return answer;
    }

}
