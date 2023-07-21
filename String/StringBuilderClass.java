package String;
/*
StringBuffer class is non thread-safe i.e. multiple threads can access it simultaneously. 
It creates an empty String buffer with the initial capacity of 16.
If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2.
consumes very less time than string builder
 */

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello ");

        sb.append("Java");// now original string is changed
        System.out.println(sb);// prints Hello Java

        sb.insert(1, "Java");// now original string is changed
        System.out.println(sb);// prints HJavaello

        sb.insert(1, "Java");// now original string is changed
        System.out.println(sb);// prints HJavaello

        sb.delete(1, 3);
        System.out.println(sb);// prints Hlo

        sb.reverse();
        System.out.println(sb);// prints olleH

        sb.append("Java is my favourite language");
        System.out.println(sb.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
    }
}
