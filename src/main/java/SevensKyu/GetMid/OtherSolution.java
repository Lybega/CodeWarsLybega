package SevensKyu.GetMid;

public class OtherSolution {
    public static void main(String[] args) {
        String a = "abcderfa";
        String b = "najanjsajshb";
        String c = "ndjflaysdbbkjn";
        System.out.println(getMiddle(a));
    }
    public static String getMiddle(String word) {
        int length = word.length();
        return (length % 2 != 0) ?  String.valueOf(word.charAt(length / 2)) : word.substring(length / 2 - 1, length / 2 + 1);
    }
}
