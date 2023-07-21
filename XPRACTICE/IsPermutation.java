package XPRACTICE;

import java.util.Arrays;

public class IsPermutation {
    String checkPer(String str1,String str2){
        int n1 = str1.length();
        int n2 = str2.length();

        if(n1!=n2)
            return "no";
        
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i= 0;i<n1;i++)
        if(ch1[i] != ch2[i])
            return "no";
        return "yes";
        

    }
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "aba";

        IsPermutation ip = new IsPermutation();
        System.out.println(ip.checkPer(str1,str2));
    }
}
