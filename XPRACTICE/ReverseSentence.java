package XPRACTICE;

public class ReverseSentence {
    public static String revSen(String s) {
        String str[] = s.split(" ");
        String res = "";
        int i, n = str.length;
        for (i = n - 1; i >= 0; i--) {
            res += str[i] + " ";
        }

        return res;

    }

    public static void main(String[] args) {
        String str = "Hi there";
        System.out.println(str);
        System.out.println(revSen(str));
    }
}
