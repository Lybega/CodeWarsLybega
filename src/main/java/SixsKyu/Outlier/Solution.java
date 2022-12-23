package SixsKyu.Outlier;

public class Solution {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3, 5, 7, 9}, {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}, {2,6,8,-10,3}};
        for (int[] temp: arr)
            System.out.println(find(temp));
    }
    static int find(int[] integers) {
        int oddCounter = 0, evenCounter = 0;
        StringBuilder oddStr = new StringBuilder();
        StringBuilder evenStr = new StringBuilder();
        for (int temp : integers) {
            if (temp % 2 == 0){
                oddCounter++;
                oddStr.append(temp);
            }
            else {
                evenCounter++;
                evenStr.append(temp);
            }
            if ((evenCounter > 1 && oddCounter > 0) || (evenCounter > 0 && oddCounter > 1)) break;
        }
        return evenCounter > oddCounter ? Integer.parseInt(oddStr.toString()) : Integer.parseInt(evenStr.toString());
    }
}
