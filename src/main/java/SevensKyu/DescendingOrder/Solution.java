package SevensKyu.DescendingOrder;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        int a = 432645;
        int b = 374834;
        int c = 11233455;
        System.out.println(sortDesc(c));
    }
    public static int sortDesc(final int num) {
        String[] numbers = Integer.toString(num).split("");
        Integer[] arr = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            arr[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        String answer = "";
        for (int i = 0; i < arr.length; i++)
            answer = answer + arr[i];
        return Integer.parseInt(answer);
    }
}
