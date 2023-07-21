package XPRACTICE;

public class ReverseString {
    static void revStr1(String str){
        String res = "";
        int length = str.length();
        for(int i = 0;i<length;i++){
            char ch = str.charAt(i);
            res = ch + res;
        }
        System.out.println(res);
    }

    static void revStr2(String str){
        char chrArr[] = str.toCharArray();
        int length = str.length();
        for (int i = length-1; i >= 0; i--) {
            System.out.print(chrArr[i]);
        }
    }

    static void revStr3(String str){
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
    public static void main(String[] args) {
        String str = "Ujjwal";
        revStr3(str);
    }
}
