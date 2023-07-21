package TypeConversion;

public class TypeConversion {
    public static void main(String[] args) {
        // Integer <-> int
        int a = 1000;

        Integer a1 = Integer.valueOf(a);
        int a2 = a1.intValue();


        double d = (double)a;
        double d1 = Double.valueOf(a);
        int a3 = (int)d1;

        String s = Integer.toString(a);
        String s1 = String.valueOf(a);
        int a4 = Integer.parseInt(s,2); // bin to dec conversion

        System.out.println(a4);
        System.out.println(d);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(s1);

    }

    
}
