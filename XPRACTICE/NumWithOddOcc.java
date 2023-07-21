package XPRACTICE;
import java.util.*;

public class NumWithOddOcc {
    static int numWithOddOcc(int n){
        int count = 0;

        for(int i = 1;i<= n;i++){
            int e = i;
            int chr = 0;
            while(e != 0){
                chr += 1;
                e= e/10;
            }
            if(chr % 2 != 0){
                count += 1;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(numWithOddOcc(n));

        sc.close();
    }
}
