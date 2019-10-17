
import java.util.*;
import java.util.Scanner;
public class Mortgage {
    public static void main( String [] args ) {
        System.out.println("What is the rate of the mortgage ?");
        Scanner scanny = new Scanner(System.in);
        double aIR = scanny.nextDouble();
        aIR = aIR/100;
        double mIR = aIR / 12;
        System.out.println("How long is this mortgage in years?");
        int nOY = scanny.nextInt();

        System.out.println("What is the mortgage amount?");
        int M = scanny.nextInt();

        double FinalAnswer = (mIR * M)/(1- Math.pow(1/(1 + mIR), 12* nOY));
        System.out.println("Your montyly payment is " + FinalAnswer);





    }
}
