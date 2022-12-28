package SevensKyu.OnesAndZeros;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 1, 1, 1};
        System.out.println(ConvertBinaryArrayToInt(Arrays.asList(a)));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder strBuild = new StringBuilder();
        for (int i = 0; i < binary.size(); i++) {
            strBuild.append(binary.get(i));
        }
        String str = strBuild.toString();
        return Integer.parseInt(str, 2);
    }
    /*
    int ans = 0;
      for (int i = 0; i < binary.size(); i++) {
        if (binary.get(i) == 1) ans += Math.pow(2,binary.size() - i - 1);
      }
      return ans;
     */
}
