/*Sum of Array Elements with Exception*/
import java.util.Random;

//Array class
class Fraction{
	//Main Method
    public static void main(String[] args) {
        Random r = new Random();

        for (double i = 0; i < 10; i++) {
        	
            //Numerator ranging from 1 to 10
            int num = r.nextInt(9) + 1;
            System.out.println ("Numerator =" + num);
            
            
            //Denominator ranging from 0 to 5
            int denom = r.nextInt(5);
            System.out.println ("Denominator =" + denom);
            
            
            //Try Catch block to handle exception
            try {
            	double f = (double) num/denom ;
                System.out.println("Fraction=" + f);
                System.out.println ("----------------------------------");

            } catch (ArithmeticException e) {
                System.out.println("Exception Type = " + e);
                System.out.println ("----------------------------------");
            }
        }
    }
}