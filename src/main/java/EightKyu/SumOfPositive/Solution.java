package EightKyu.SumOfPositive;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, -5, -6, 10};
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > 0)
                sum = sum + arr[i];
        return sum;
    }
}
