package OOPS.Polymorphism;
class Student1{
    String name;
    static String school;

    public static void changeSchool(){
        school = "SVM";
    }
}
public class StaticKeyword {
    public static void main(String[] args) {
        Student1.school = "Dav";       // no need to create object to access

        Student1 student1 = new Student1();
        student1.name = "Ujjwal";
        System.out.println("Name => " + student1.name + ", School => " + Student1.school);
        Student1.changeSchool();
        System.out.println("Name => " + student1.name + ", School => " + Student1.school);
    }
}
