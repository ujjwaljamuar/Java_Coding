package OOPS.Inheritance;

class Shape{
    public void area(){
        System.out.println("Displays Area . ");
    }
}

class Triangle extends Shape{
    public void area(int b,int h){
        System.out.println(0.5*b*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println(Math.PI*r*r);
    }
}
public class HeirarchichalInheri {
    
}
