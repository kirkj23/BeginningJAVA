import java.util.Scanner;
public class DemoWrapper
{
    public static void main( String [] args )
    {
       Scanner intScan = new Scanner(System.in);

       String StringNum = " ";
        System.out.println("Enter a number");
        StringNum = intScan.next();
        char c = StringNum.charAt(0);

        if(Character.isDigit(c)) {


            int intPrimitive = 42;
            Integer integerobject = intPrimitive;
            intPrimitive = Integer.parseInt(StringNum);


            System.out.println("The int is " + intPrimitive);
            System.out.println("The Integer object is" + integerobject);

            int sum = intPrimitive + integerobject;
            System.out.println("Their sum is" + sum);

            int il = Integer.parseInt(" 76");
            Integer i2 = Integer.valueOf("76");

            System.out.println("The value of il is" + il);
            System.out.println("The value of i2 is" + i2);

        }

    }
}

