package SevensKyu.CasingStrings;

public class Solution {
    public static void main(String[] args) {
        String s = "toJadenCase doesn't return a valide JadenCase String! try again please :), Most Trees Are Blue";
        System.out.println(toJadenCase(s));
}
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals(""))
            return null;
        else{
            String[] str = phrase.split(" ");
            for (int i = 0; i < str.length; i++){
                if (str[i].matches("\\W*"))
                    continue;
                StringBuilder a = new StringBuilder(str[i]);
                String first = (String.valueOf(str[i].charAt(0))).toUpperCase();
                a.replace(0,1, first);
                str[i] = String.valueOf(a);
            }
            return String.join(" ", str);
        }
    }

}
