package EightKyu.StringEnds;

public class Solution {
    public static void main(String[] args) {
        String str = "abcd";
        String ending = "cde";
        System.out.println(solution(str,ending));
    }
    public static boolean solution(String str, String ending) {
        if (str.endsWith(ending))
            return true;
        else return false;
    }
}
