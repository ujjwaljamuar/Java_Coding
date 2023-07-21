package String;
import java.util.StringTokenizer;  
public class StringTokenizerClass {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my name is khan", " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }


        String s = "Java Code Geeks - Java Examples";
          
        StringTokenizer str = new StringTokenizer(s);
          
        String sReversed = "";
          
        while (str.hasMoreTokens()) {
            sReversed = str.nextToken() + " " + sReversed;
        }
         
        System.out.println("Original string is : " + s);
        System.out.println("Reversed string is : " + sReversed);
    }
}
