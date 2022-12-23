package SevensKyu.DNA;

public class Solution {
    public static void main(String[] args) {
        String[] DNA = new String[]{"ATGC", "GTAT", "", "Haskel", "AAAA" };
        for (String str:DNA){
            System.out.println(makeComplement(str));
        }
    }
    public static String makeComplement(String dna) {
        String[] str;
        if (dna.equals("")) return "";
        else {
            str = dna.split("");
            for (int i = 0; i < str.length; i++) {
                if (str[i].equals("A")) str[i] = "T";
                else if (str[i].equals("T")) str[i] = "A";
                if (str[i].equals("C")) str[i] = "G";
                else if (str[i].equals("G")) str[i] = "C";
            }
        }
        return String.join("", str);
    }
}
