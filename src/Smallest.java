
import java.util.*;
import java.util.Scanner;
public class Smallest {
    public static void main(String[] args) {
        Scanner Scanny = new Scanner(System.in);
        System.out.print("What is the first number?");
        int num1 = Scanny.nextInt();
        System.out.println("What is the second number?");
        int num2 = Scanny.nextInt();
        System.out.println("What is the third number?");
        int num3 = Scanny.nextInt();

        if (num1 < num2 && num2<num3) {
            int smallest = num1;
            System.out.println("The smallest number is" + smallest);
        } if(num1>num2 && num2< num3) {
            int smallest = num2;
            System.out.println("The smallest number is" + smallest);
        }
        if (num1>num3 && num3 < num2) {
            int smallest = num3;

            System.out.println("The smallest number is" + smallest);

        }
    }
}
