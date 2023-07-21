package XPRACTICE;

import java.util.Arrays;

public class RemoveDuplicatesString {
    String remDup(String str){
        int n = str.length();
        int index = 0;

        char[] ch = str.toCharArray();
        int j;
        for(int i = 0;i<n;i++){
            for(j = 0;j<i;j++){
                if(ch[i] == ch[j]){
                    break;
                }
            }

            if(j==i){
                ch[index++] = ch[i];
            }

        }

        return String.valueOf((Arrays.copyOf(ch, index)));
    }
    public static void main(String[] args) {
        String str = "aabbccdd";
        
        RemoveDuplicatesString rds = new RemoveDuplicatesString();
        System.out.println(rds.remDup(str));
    }
}
