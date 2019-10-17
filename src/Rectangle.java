public class Rectangle {
    private Point p1 = new Point();
    private Point p2 = new Point();

    public Rectangle() {
        p1.setX(0);
        p2.setX(1);
        p1.setY(0);
        p2.setY(1);
    }
    public Rectangle(int x1,int y1,int x2,int y2) {
        p1.setX(x1);
        p2.setX(x2);
        p1.setY(y1);
        p2.setY(y2);
    }
    public void setX1(int val) {
        p1.setX(val);
    }
    public void setY1(int val) {
        p1.setY(val);
    }
    public void setX2(int val) {
        p2.setX(val);
    }
    public void setY2(int val) {
        p2.setY(val);
    }
    public void drawRectangle() {
        int distanceX = java.lang.Math.abs(p2.getX()-p1.getX());
        int distanceY = java.lang.Math.abs(p2.getY()-p1.getY());
        for (int i = distanceX; i > 0; i--) {
            System.out.print('-');
        }
        System.out.println();
        for (int i = distanceY - 2; i > 0; i--) {
            System.out.print('|');
            for (int j = distanceX - 2; j > 0; j--) {
                System.out.print(' ');
            }
            System.out.println('|');
        }
        for (int i = distanceX; i > 0; i--) {
            System.out.print('-');
        }
        System.out.println();
    }
    public int area() {
        int distanceX = java.lang.Math.abs(p2.getX()-p1.getX());
        int distanceY = java.lang.Math.abs(p2.getY()-p1.getY());

        return distanceX * distanceY;
    }
    public void compareArea(Rectangle rectangle) {
        int distanceX = java.lang.Math.abs(p2.getX()-p1.getX());
        int distanceY = java.lang.Math.abs(p2.getY()-p1.getY());
        int area1 = distanceX * distanceY;
        int area2 = rectangle.area();
        if (area1 > area2) {
            System.out.print("Rectangle 1 is larger");
        }
        else {
            System.out.print("Rectangle 2 is larger");
        }
    }
}

