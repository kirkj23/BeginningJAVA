
import java.util.Scanner;
public class YearOfBirth {
    public static void main( String [] args )
    {
        Scanner YearScan = new Scanner(System.in);
System.out.println("What year were you born?");
        int Num = YearScan.nextInt();

        int currentYear = 2019;

        int age = currentYear - Num;
                System.out.println("Your age is " + age);
                double b = 78.94;
                        System.out.println("Average life expectancy is " + b);
                                double c = age/b * 100;
                                        System.out.println("You have lived " + c);
    System.out.print(" % of your life.");
    }
}

