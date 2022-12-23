package SixsKyu.PhoneNumber;

public class Other {
    public static void main(String[] args) {
        int [] numbers = new int[]{1, 2, 3, 4, 6, 5, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(numbers));
    }
    public static String createPhoneNumber(int[] numbers){
        String phoneNumber = "(xxx) xxx-xxxx";
        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
        }
        return phoneNumber;
    }
}
