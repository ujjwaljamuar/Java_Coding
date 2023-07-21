package String;

import java.util.*;

public class OccurEveryChar {
    static void countFreq(String str){
        HashMap<Character, Integer> hm = new HashMap<>();

        char chArr[] = str.toCharArray();
        
        for(char c: chArr){
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c)  + 1);
            }
            else{
                hm.put(c, 1);
            }            
        }

        for(Character c : hm.keySet()){
            System.out.println(c + " occured " + hm.get(c) + " times");
        }

        

    }
    static void countFreqBrute(String str){
        int i, length, counter[] = new int[256];
 
        length = str.length();
 
        // Count frequency of every character and store
        // it in counter array
        for (i = 0; i < length; i++) {
            counter[(int) str.charAt(i)]++;
        }

        // Print Frequency of characters
        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " --> " + counter[i]);
            }
        }
    }
    public static void main(String[] args) {
        String str = "Ujjwal";

    // countFreqBrute(str);
        countFreq(str);
    }
}
