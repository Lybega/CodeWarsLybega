package EightKyu.ArrayDiff;


import java.util.ArrayList;
import java.util.Arrays;


public class Solution {
    public static void main(String[] args) {
        int[] a = new int[] {1, 5, 1, 2, 1,};
        int[] b = new int[] {1, 2};
        System.out.println(Arrays.toString(arrayDiff(a, b)));
    }
    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < a.length; i++){
            arrList.add(a[i]);
        }
        for (int i = 0; i < b.length; i++){
            int count = 0;
            int n = arrList.size();
            if (n == 0)
                break;
            for (int j = 0; j < n; j++){
                if (arrList.get(n - 1 - j) == b[i]){
                    arrList.remove(n - 1 - j);
                    //if (j == 0) continue;
                    //count++;
                }
            }
        }
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < answer.length; i++)
            answer[i] = arrList.get(i);
        return answer;
    }
}
