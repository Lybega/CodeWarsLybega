package SixsKyu.PhoneNumber;



public class Solution {
    public static void main(String[] args) {
        int [] numbers = new int[]{1, 2, 3, 4, 6, 5, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(numbers));
    }
    public static String createPhoneNumber(int[] numbers){
        StringBuilder s = new StringBuilder(); //"(___) ___-____"
        for (int a : numbers){
            s.append(a);
        }
        s.insert(0,"(");
        s.insert(4, ") ");
        s.insert(9, "-");
        return s.toString();
    }
}
