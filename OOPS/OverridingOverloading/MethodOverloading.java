package OOPS.OverridingOverloading;

/*
    If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

    By changing number of arguments
    By changing the data type
 */
public class MethodOverloading {

    void sum(int a, long b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        MethodOverloading obj1 = new MethodOverloading();
        obj1.sum(20, 30, 40);
        obj1.sum(20,30);
    }
}