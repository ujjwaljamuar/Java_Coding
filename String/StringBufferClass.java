package String;

// StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. So it is safe and will result in an order.
//	It creates an empty String buffer with the initial capacity of 16.
//  If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2.
// consumes moret time than string builder

public class StringBufferClass {
    public static void main(String[] args) {
        String s = "Hello ";
        StringBuffer sb = new StringBuffer(s);

        sb.append("Java");// now original string is changed
        System.out.println(sb);// prints Hello Java

        sb.insert(1, "Java");// now original string is changed
        System.out.println(sb);// prints HJavaello

        sb.replace(1, 3, "Java");
        System.out.println(sb);// prints HJavalo

        sb.delete(1, 3);
        System.out.println(sb); // prints Hlo

        sb.reverse();
        System.out.println(sb);// prints olleH

        sb.append("java is my favourite language");
        System.out.println(sb.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2

    }
}
