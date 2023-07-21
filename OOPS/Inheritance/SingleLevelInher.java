package OOPS.Inheritance;



class Parent{
    public void get(){
        System.out.println("Parent");

    }
}

class Child extends Parent{
    public void get(){
        System.out.println("child");

    }
}
public class SingleLevelInher {
    public static void main(String[] args) {
        Parent p = new Child();
        p.get();
    }
}


