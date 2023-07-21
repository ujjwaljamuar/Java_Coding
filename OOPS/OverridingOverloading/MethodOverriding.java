package OOPS.OverridingOverloading;
/*
    If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
    
    Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
    Method overriding is used for runtime polymorphism
   1 The method must have the same name as in the parent class
   2 The method must have the same parameter as in the parent class.
   3 There must be an IS-A relationship (inheritance).
 */
class Bank{
    public int getInterest(){
        return 0;
    }
}

class Sbi extends Bank{
    public int getInterest(){
        return 5;
    }
}

class Axis extends Bank{
    public int getInterest(){
        return 8;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Bank b = new Bank();
        Sbi sbi = new Sbi();
        Axis axis = new Axis();

        System.out.println(b.getInterest());
        System.out.println(sbi.getInterest());
        System.out.println(axis.getInterest());

    }
}
