package XPRACTICE;

import java.io.*;

public class InputOutput {
    public static void main(String[] args) throws IOException{ 
        // always put throws IOException and try block
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder(); 

            //or use scanner like this
            //Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
            
            
            System.out.println("Enter Name using bufferedreader: ");
            String name = br.readLine();      // String Input

            System.out.println("Enter age using bufferedreader: ");
            int age = Integer.parseInt(br.readLine());    //Integer Input


            sb.append("Your name is " + name + " and your age is " + age);


            bw.write(sb.toString());
            
            bw.flush();             // flush the buffer stream
            bw.close();             // close important!
        } catch (Exception e) {
            

            System.out.println("Exception Found!");
        }
    }
}
