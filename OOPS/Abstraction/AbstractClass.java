package OOPS.Abstraction;

abstract class Animal{
    abstract void walk();

    public void eat(){
        System.out.println("Can eat");
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Horse Walks on 4 legs.");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken Walks on 2 legs.");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
    //Animal animal = new Animal();
    //animal.walk();                             Cannot instantiate abstract class
    
    Horse horse = new Horse();
    horse.walk();
    horse.eat();
    
    Chicken chicken = new Chicken();
    chicken.walk();
    }
}
