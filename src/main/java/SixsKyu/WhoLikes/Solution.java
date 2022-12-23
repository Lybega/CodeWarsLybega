package SixsKyu.WhoLikes;

public class Solution {
    public static void main(String[] args) {
        String[][] names = new String[][]{{}, {"Alex"}, {"Alex", "Ben"}, {"Alex", "Ben", "Colin"}, {"Alex", "Ben", "Colin", "Daniel"}};
        for (String[] temp : names)
            System.out.println(whoLikesIt(temp));
    }
    public static String whoLikesIt (String[] names){
        String answer = "";
        if(names.length==0){
            answer="no one likes this";
        }
        if(names.length==1){
            answer=names[0]+" likes this";
        }
        if(names.length==2){
            answer=names[0]+" and "+names[1]+" like this";
        }
        if(names.length==3){
            answer=names[0]+", "+names[1]+" and "+names[2]+" like this";
        }
        if(names.length>3){
            answer=names[0]+", "+names[1]+" and "+(names.length-2)+" others like this";
        }
        return answer;
    }

}
