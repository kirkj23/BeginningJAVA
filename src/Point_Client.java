//Jake Kirk
// 9/23/19

import java.util.*;
public class Point_Client {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers.");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        Point p1= new Point(num1,num2);


        Point p2 = new Point(num2,num1);

        System.out.println("Please enter two numbers.");

        num1 = input.nextInt();
         num2 = input.nextInt();

        Point p3 = new Point(num1, num2);

        p1.modify(3);
        p2.setX(7);
        p2.setY(8) ;

        double distance= p1.distance(p2);
        System.out.println("point 1 =" +p1.toString());

        System.out.println("point 2 =" +p2. toString());
        System.out.println("point 3 =" +p3.toString());

        System.out.printf("Distance =%.2f",distance);


    }
}

//create a distance mthod
//double distance= Math.swrt(Math.pow((p1.x-p2.x),2) +(Math.pow((p1.y-p2.y),2)))
//add a translate method (add or subtract to x and/or y
