package XPRACTICE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        
        int arr[] = {11,11,12,14,12,10};

        String str = "aabbccdd";
        char[] ch = str.toCharArray();

        List<Integer> al = new ArrayList<>();
        List<Character> sl = new ArrayList<>();

        for(int i = 0;i<arr.length;i++){
            al.add(arr[i]);
        }

        for(int i = 0;i<ch.length;i++){
            sl.add(ch[i]);
        }

        al = new ArrayList<>(new LinkedHashSet<>(al));     //Hashset removes all duplicates
        sl = new ArrayList<>(new LinkedHashSet<>(sl));
        
        Collections.sort(al);

        System.out.println(al);

        String string = sl.toString().substring(1,3*sl.size() - 1).replaceAll(", ", "");
        System.out.println(string);
    }
}
