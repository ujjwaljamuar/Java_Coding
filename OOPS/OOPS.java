package OOPS;

class Pen {
    String color;
    String type;

    public void printColor() {
        System.out.println(this.color);
    }

    public void printType() {
        System.out.println(this.type);
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {

        System.out.println(this.name + "                                 " + this.age);
    }
}

public class OOPS {

    public static void main(String[] args) {
        // Pen p1 = new Pen();

        // p1.color = "red";
        // p1.type = "ballpen";
        // p1.printColor();
        // p1.printType();

        Student s1 = new Student("Ujjwal Jamuar", 21);
        Student s2 = new Student("Somesh Kumar", 22);
        Student s3 = new Student("Prashant Mishra", 23);
        Student s4 = new Student("Chandan Dehury", 24);

        System.out.println("Name                                        Age");
        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
        s4.printInfo();

    }

}
