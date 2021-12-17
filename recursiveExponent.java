/*
 * Purpose/Description: This program calculates a given number to a given exponent 
 * Author’s Panther ID: 6198722           
 * Certification:    
 * I hereby certify that this work is my own and none of it is the work of    
 * any other person.  
 */
package assignment1problem3b;

/**
 *
 * @author mordy
 */
public class Assignment1Problem3b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Problem Three (B)");
        
        //prints 7^3
        System.out.println(exponentiation(7, 3));
    }

    // calculat a number to the given exponent thought multiplying the number to the power of
    // half the given exponent by it self. for example to calculase 2^4 the program will callculate (2^2)*(2^2).
    // 
    public static long exponentiation(long x, int n) {

        //anything rased to 0th power is one
        if (n == 0) {
            return 1;
        } 

        //anything rased to 1st power is it's self
        else if (n == 1) {
            return x;
        }

        //if the exponent is odd then x^n = x * (x^(n/2))* (x^(n/2))
        else if (n % 2 > 0) {
            long y = exponentiation(x, n / 2);
            return x * y * y;
        } else {
            long y = exponentiation(x, n / 2);
            return y * y;
        }

    }

}
