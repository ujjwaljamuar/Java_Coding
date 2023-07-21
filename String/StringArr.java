package String;
import java.util.*;

public class StringArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String strarr[] = new String[n];

        for(int i = 0;i<strarr.length;i++){
            strarr[i] = sc.next();
        }
        // remove vowels and place * before every consonent
        for(int i = 0;i<strarr.length;i++){
            String s = strarr[i];
            s = s.replaceAll("[aeiouAEIOU]", "");
            s = s.replaceAll("([a-zA-Z])", "*$1");
            s = s.toLowerCase();

            System.out.println(s);
            
        }

        
        sc.close();
    }
}
