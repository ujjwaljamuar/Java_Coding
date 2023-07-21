package XPRACTICE;

import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = 15/0;
            System.out.println(a);

        }catch(NumberFormatException e){
            System.out.println("Exception caught");
        }
        catch(ArithmeticException ae){
            System.out.println("ArithmeticException ");
        }
        
        /*
         catch (ExceptionType1 | Exceptiontype2 ex) { 
            we can also use this for multiple catch
         */

        finally{
            System.out.println("Finally block always executed.");
        }
        
        
        sc.close();

    }
}
