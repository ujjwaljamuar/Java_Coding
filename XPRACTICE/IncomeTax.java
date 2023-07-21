package XPRACTICE;

import java.io.*;

public class IncomeTax {
    static double calculateTax(double inc) {
        double tax = 0.0;
        double ftax = 0.0;
        // double tax250k = 0;
        double tax500k = 0.05*250000.0;
        double tax750k = 0.1*250000.0;
        double tax1000k = 0.15*250000.0;
        double tax1250k = 0.2*250000.0;
        double tax1500k = 0.25*250000.0;
        

        if (inc > 0 && inc <= 250000) {
            tax = 0;
            ftax = 0;
            return ftax;
        }

        if (inc > 250000 && inc <= 500000) {
            tax = 0.05 * inc;
            ftax = tax + 0.04 * tax;
            return ftax;
        }

        if (inc > 500000 && inc <= 750000) {
            tax = tax500k + ((inc - 500000) * 0.1);
            ftax = tax + 0.04 * tax;
            return ftax;
        }
        if (inc > 750000 && inc <= 1000000) {
            tax = tax500k + tax750k + ((inc - 7500000) * 0.15);
            ftax = tax + 0.04 * tax;
            return ftax;
        }
        if (inc > 1000000 && inc <= 1250000) {
            tax = tax500k + tax750k + tax1000k+ ((inc - 1000000) * 0.2);
            ftax = tax + 0.04 * tax;
            return ftax;
        }
        if (inc > 1250000 && inc <= 1500000) {
            tax = tax500k + tax750k + tax1000k+ tax1250k + ((inc - 1250000) * 0.25);
            ftax = tax + 0.04 * tax;
            return ftax;
        }
        if (inc > 1500000) {
            tax = tax500k + tax750k + tax1000k+ tax1250k + tax1500k + ((inc - 1500000) * 0.3);
            
            if (inc > 5000000 && inc <= 10000000){
                ftax = (tax + 0.1 * tax );
                ftax = ftax + (0.04*ftax);
                return ftax;
            }

            if (inc > 10000000 && inc <= 20000000){
                ftax = (tax + 0.15 * tax )+ (0.04*tax);
                return ftax;
            }
            if (inc > 20000000 && inc <= 50000000){
                ftax = (tax + 0.25 * tax )+ (0.04*tax);
                return ftax;
            }
            if (inc > 50000000){
                ftax = (tax + 0.37 * tax )+ (tax + 0.04*tax);
                return ftax;
            }
        }

        return ftax;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your total income : ");
        //double income = Double.parseDouble(br.readLine());
        double income = Double.valueOf(br.readLine());
        System.out.println("Your total liable tax is = Rs "+calculateTax(income));

    }
}
