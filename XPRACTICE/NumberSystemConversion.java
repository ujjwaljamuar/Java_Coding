package XPRACTICE;
public class NumberSystemConversion {
    public static void main(String[] args) {
        // dec to bin

        int n = 10;
        String s = Integer.toBinaryString(n);
        System.out.println(n + " in decimal = " +s);

        //binary to decimal
        int bin = 1010;
        String str = Integer.toString(bin);
        int dec = Integer.parseInt(str,2);
        System.out.println("Number in decimal = " + dec);

    }
}
