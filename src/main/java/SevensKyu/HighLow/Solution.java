package SevensKyu.HighLow;

public class Solution {
    public static void main(String[] args) {
        String firstLine = "1 -2 3 4 565 6 7 8 1 2";
        String secondLine = "1 -2 9 4 9 676 7 8 1 -2";
        String thirdLine = "7 5 -3 4 5 6 7 8 1 2";
        System.out.println(highAndLow(thirdLine));
    }

    public static String highAndLow(String numbers) {
        String[] arrNumbers = numbers.split("\\s+");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arrNumbers.length; i++){
            max = Math.max(Integer.parseInt(arrNumbers[i]), max);
            min = Math.min(Integer.parseInt(arrNumbers[i]), min);
        }
        String answer = max + " " + min;
        return answer;
    }
}