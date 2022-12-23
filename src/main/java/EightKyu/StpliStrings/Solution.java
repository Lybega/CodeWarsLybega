package EightKyu.StpliStrings;

import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println(Arrays.toString(ArrayOfString(a)));
    }
    public static String[] ArrayOfString (String a){

        if (a.length() % 2 == 1)
            a += "_";
        String[] str = new String[(int)(Math.ceil(a.length() / 2.0))];
        String[] b = a.split("");
        for (int i = 0; i < str.length; i++){
            if (i == 0)
                str[i] = b[i] + b[i+1];
            else
                str[i] = b[i * 2] + b[(i * 2) + 1];
            }
        return str;
        }



    }
