package XPRACTICE;

public class ReverseInteger {

    static int reverseNumber(int x) {
        long reverse = 0;

        while (x != 0) {
            long rem = x % 10;
            reverse = reverse * 10 + rem;
            x = x / 10;
        }

        int res = (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) ? 0 : (int) reverse;

        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(-1234));
    }
}
