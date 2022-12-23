package SevensKyu.VowelCount;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(getCount(str));

    }
    public static int getCount(String str) {
        String[] vowels = new String[] {"a", "e", "i", "o", "u"};
        int vowelsAmount = vowels.length;
        int vowelsCount = 0;
        String[] strArray = str.split("");
        for (int i = 0; i < strArray.length; i++){
            for (int j = 0; j < vowelsAmount; j++){
                if (strArray[i].equals(vowels[j]))
                    vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
