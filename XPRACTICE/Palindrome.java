package XPRACTICE;
public class Palindrome {
    static boolean isPalindrome(String str)
    {
 
        
        int i = 0, j = str.length() - 1;
 
        
        while (i < j) {
            
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
 
        return true;
    }
    public static void main(String[] args) {
        int n = 1001;
        String str = Integer.toString(n);
        str = str.toLowerCase();
        
        if(isPalindrome(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
        
    }
}
