package SevensKyu.DNA;

public class OtherSolution {
    public static void main(String[] args) {
        String[] DNA = new String[]{"ATGC", "GTAT", "", "Haskel", "AAAA"};
        for (String str : DNA) {
            System.out.println(complement(str));
        }
    }
    public static String complement (String dna){
        dna = dna.replace("A", "t");
        dna = dna.replace("T", "a");
        dna = dna.replace("G", "c");
        dna = dna.replace("C", "g");
        return dna.toUpperCase();
    }
}