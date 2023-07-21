package OOPS.Polymorphism;
class Student{
    String name;
    int age;

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Ujjwal");
    }
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }


}
public class Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student("Ujjwal Jamuar", 21);
    
        s1.printInfo();
        s1.printInfo("Ujjwal");
        s1.printInfo(21);
        s1.printInfo("Ujjwal",21);
    }

    
}
