package XPRACTICE;
import java.util.*;

class MobileKeypad {

    static int returnComb(int n) {
        int res = 1;
        if (n < 1) {
            return 0;
        } else {
            while (n != 0) {
                int rem = n % 10;
                if (rem == 0) {
                    res *= res;
                } else if (rem != 9) {
                    res *= 3;
                } else {
                    res *= 2;
                }

                n = n / 10;
            }
            return res;
        }

    }

    static Character[][] numberToCharMap;

    private static List<String> printComb(int[] numbers,int len,int numIndex,String s)

    {
        if (len == numIndex) {
            return new ArrayList<>(Collections.singleton(s));
        }
 
        List<String> stringList = new ArrayList<>();
 
        for (int i = 0; i < numberToCharMap[numbers[numIndex]].length;i++) {

            String sCopy = String.copyValueOf(s.toCharArray());

            sCopy = sCopy.concat(numberToCharMap[numbers[numIndex]][i].toString());

            stringList.addAll(printComb(numbers, len, numIndex + 1, sCopy));
        }

        return stringList;

    }

    private static void printWords(int[] numbers)

    {
        generateNumberToCharMap();
        List<String> stringList = printComb(numbers, numbers.length, 0, "");
        System.out.println(stringList);
        
        //stringList.stream().forEach(System.out::println);
        //System.out.println("");
    }

    private static void generateNumberToCharMap()

    {
        numberToCharMap = new Character[10][5];

        numberToCharMap[0] = new Character[] { '\0' };

        numberToCharMap[1] = new Character[] { 'a', 'b', 'c' };

        numberToCharMap[2] = new Character[] { 'd', 'e', 'f' };

        numberToCharMap[3] = new Character[] {  'g', 'h', 'i' };

        numberToCharMap[4] = new Character[] { 'j', 'k', 'l' };

        numberToCharMap[5] = new Character[] { 'm', 'n', 'o' };

        numberToCharMap[6] = new Character[] { 'p', 'q', 'r'};

        numberToCharMap[7] = new Character[] { 's','t', 'u' };

        numberToCharMap[8] = new Character[] { 'v','w', 'x' };

        numberToCharMap[9] = new Character[] { 'y', 'z' };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;

        ArrayList<Integer> al = new ArrayList<>();
        while (n != 0) {
            int rem = n % 10;
            al.add(rem);
            n = n / 10;

        }
        // int[] keys = {2, 3, 4};

        int key[] = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            key[i] = al.get(i);
        }

        printWords(key);

        System.out.println(returnComb(m));

        sc.close();
    }
}