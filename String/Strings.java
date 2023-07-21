package String;

public class Strings {
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");
        String s4 = "Saurav";
        System.out.println(s1.equals(s2));// true
        System.out.println(s1.equals(s3));// true
        System.out.println(s1.equals(s4));// false


        String s5="Sachin";  
        String s6="SACHIN";  
        
        System.out.println(s5.equals(s6));//false  
        System.out.println(s5.equalsIgnoreCase(s6));//true 

        String s7="Sachin";  
        String s8="Sachin";  
        String s9=new String("Sachin");  
        System.out.println(s7==s8);//true (because both refer to same instance)  
        System.out.println(s7==s9);//false(because s3 refers to instance created in nonpool)  


        String s10="Sachin";  
        String s11="Sachin";  
        String s12="Ratan";  
        System.out.println(s10.compareTo(s11));//0  
        System.out.println(s10.compareTo(s12));//1(because s1>s3)  
        System.out.println(s11.compareTo(s12));//-1(because s3 < s1 )  

        String str = "My name is Ujjwal ";
        System.out.println(str.trim()); // removes beginning and ending white space only

        System.out.println(str.replace(" ", ""));

        // Reverse a sentence
        String str1="java string split method by javatpoint";  
        String[] words=str1.split("\\s");//splits the string based on whitespace  

        for (int i = words.length-1; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }
}
