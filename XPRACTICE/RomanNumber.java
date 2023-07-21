package XPRACTICE;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class RomanNumber {
    private static final TreeMap<Integer, String> ROMAN_SYMBOLS = new TreeMap<>();

    static {
        ROMAN_SYMBOLS.put(1000, "M");
        ROMAN_SYMBOLS.put(900, "CM");
        ROMAN_SYMBOLS.put(500, "D");
        ROMAN_SYMBOLS.put(400, "CD");
        ROMAN_SYMBOLS.put(100, "C");
        ROMAN_SYMBOLS.put(90, "XC");
        ROMAN_SYMBOLS.put(50, "L");
        ROMAN_SYMBOLS.put(40, "XL");
        ROMAN_SYMBOLS.put(10, "X");
        ROMAN_SYMBOLS.put(9, "IX");
        ROMAN_SYMBOLS.put(5, "V");
        ROMAN_SYMBOLS.put(4, "IV");
        ROMAN_SYMBOLS.put(1, "I");
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter an Integer : ");

            int num = Integer.parseInt(br.readLine());

            String romanValue = convertToRoman(num);

            System.out.println(num + " : " + romanValue);
        } 
        catch (Exception e) {
            System.out.println(e);
        }

    }

    public static String convertToRoman(int number) {
        StringBuilder romanNumeral = new StringBuilder();

        while (number > 0) {
            int key = ROMAN_SYMBOLS.floorKey(number);
            String symbol = ROMAN_SYMBOLS.get(key);
            romanNumeral.append(symbol);
            number -= key;
        }

        return romanNumeral.toString();
    }
}
