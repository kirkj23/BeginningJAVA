import java.util.Scanner;

public class WriteOutMath {

    public static void main(String[] args) {

        int firstnumber, secondnumber;
        Scanner scanny = new Scanner(System.in);
        System.out.println("Enter a number : ");
        firstnumber = scanny.nextInt();
        System.out.println(" Enter an Operation (+, -, , /, ^) ");
        String operation = scanny.next();
        System.out.println("Enter another number : ");
        secondnumber = scanny.nextInt();
        scanny.close();
        int result = 0;
        String fNum = NumbConv(firstnumber);
        String SNum = NumbConv(secondnumber);



        switch (operation) {
            case "+":
                result = firstnumber + secondnumber;
                System.out.println(fNum + " " + "plus" + " " + SNum + " = " + result);
                break;
            case "-":
                result = firstnumber - secondnumber;
                System.out.println(fNum + " " + "minus" + " " + SNum + " = " + result);
                break;
            case "":
                result = firstnumber * secondnumber;
                System.out.println(fNum + " " + "times" + " " + SNum + " = " + result);
                break;
            case "/":
                if (secondnumber == 0)
                {
                    System.out.println(fNum + " " + "divided by" + " " + SNum + " = " + "Undefined");
                }
                else {
                    result = firstnumber / secondnumber;
                    System.out.println(fNum + " " + "divided by" + " " + SNum + " = " + result);
                }
                break;
            case "^":
                result = (int) Math.pow(firstnumber, secondnumber);
                System.out.println(fNum + " " + "to the power of" + " " + SNum + " = " + result);
                break;

        }

    }
    public static String NumbConv(int num)
    {
        switch (num) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return null;
        }
    }
}