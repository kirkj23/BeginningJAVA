import java.util.Scanner;
public class RectangleClient {



    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        Rectangle rectangle1 = new Rectangle(0,0,5,5);
        Rectangle rectangle2 = new Rectangle();

        System.out.print("Enter the x value for point 1 of rectangle 2: ");
        int x1 = input.nextInt();
        rectangle2.setX1(x1);
        System.out.print("Enter the y value for point 1 of rectangle 2: ");
        int y1 = input.nextInt();
        rectangle2.setY1(y1);
        System.out.print("Enter the x value for point 2 of rectangle 2: ");
        int x2 = input.nextInt();
        rectangle2.setX2(x2);
        System.out.print("Enter the y value for point 2 of rectangle 2: ");
        int y2 = input.nextInt();
        rectangle2.setY2(y2);

        System.out.println("Rectangle 1:");
        rectangle1.drawRectangle();
        System.out.println("Rectangle 2:");
        rectangle2.drawRectangle();
        rectangle2.compareArea(rectangle1);
    }
}