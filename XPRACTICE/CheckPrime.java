package XPRACTICE;
import java.io.IOException;
import java.util.Scanner;

public class CheckPrime {

    static int isPrime(int n) {
        int i;
        if (n <= 1)
            return 0;

        if (n <= 3)
            return 1;

        if (n % 2 == 0 || n % 3 == 0)
            return 0;

        for (i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) throws IOException{
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number : ");
            int  n = sc.nextInt();

            System.out.println(isPrime(n));
            sc.close();

        
    }
}
