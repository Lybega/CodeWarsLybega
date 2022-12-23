package SixsKyu.OddInt;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        int[][] stream = new int[][]{{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}, {1,1,2,-2,5,2,4,4,-1,-2,5}, {20,1,1,2,2,3,3,5,5,4,20,4,5}};
        for (int[] temp: stream) System.out.println(findIntXor(temp));
    }
    public static int findInt (int[] numbers){
        ArrayList<Integer> num = new ArrayList<>();
        for (int temp:numbers)
            num.add(temp);
        Collections.sort(num);
        int temp = num.get(0);
        int counter = 1;
        for (int i = 1; i < num.size(); i++){
             if (num.get(i) == temp){
                 counter++;
                 temp = num.get(i);
             }
             if (num.get(i) != temp){
                 if (counter % 2 == 1) break;
                 temp = num.get(i);
                 counter = 1;
             }
        }
        return temp;
    }
    public static int findIntXor (int[] numbers){
        int odd=0;
        for (int item: numbers) {
            odd = odd ^ item;// XOR will cancel out everytime you XOR with the same number so 1^1=0 but 1^1^1=1 so every pair should cancel out leaving the odd number out
        }
        return odd;
    }
}
