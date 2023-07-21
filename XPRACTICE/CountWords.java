
package XPRACTICE;
import java.util.StringTokenizer;

public class CountWords {

    static void countWrd1(String str){
        if (str == null || str.isEmpty())
            System.out.println(0);
         
        // Splitting the string around
        // matches of the given regular
        // expression
        String[] words = str.split("\\s+");
         
        // Return number of words
        // in the given string
        System.out.println(words.length);

    }

    static void countWrd2(String str){

        if(str == null || str.isEmpty()){
            System.out.println(0);
        }
        StringTokenizer strt = new StringTokenizer(str);

        System.out.println(strt.countTokens());
    }
    public static void main(String[] args) {
        String str = "One two       three\n four\tfive ";
        countWrd1(str);
    }   
}
