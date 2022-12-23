package SevensKyu.Growth;

public class Solution {
    public static void main(String[] args) {
        int p0 = 1000;
        double percent = 3.5;
        int aug = 400;
        int p = 8000;
        System.out.println(nbYear(p0, percent, aug, p));

    }
    public static int nbYear (int p0, double percent, int aug, int p){
        int currentPop = p0;
        int count = 0;
        while (currentPop < p){
            currentPop = (int) (currentPop * (1.0 + (percent * 0.01))) + aug;
            count++;
        }
        return count;
    }
}
