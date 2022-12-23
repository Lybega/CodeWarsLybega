package SevensKyu.ListFiltering;

import java.util.LinkedList;
import java.util.List;


public class Solution {
    public static void main(String[] args) {
        List<Object> list =  List.of(1, 3, 5, "a", "b", "abcd", 5, "3");
        System.out.println(filterList(list));

    }
    public static List<Object> filterList(final List<Object> list){
        List<Object> editedList = new LinkedList<>();
        for (Object o : list) {
            String cls = o.getClass().toString();
            if (cls.endsWith(".Integer"))
                editedList.add(o);
            }
        return editedList;
    }
}
