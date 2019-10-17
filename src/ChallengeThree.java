public class ChallengeThree {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        line();
        top();
        bottom();
        line();
    }

    public static void line() {
        System.out.print("+");

        for (int equals = 1; equals <= (SIZE * 2) + 1; equals++) {
            System.out.print("=");
        }
        System.out.println("+");
    }

    public static void top() {

        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            for (int space = 1; space <= -line + SIZE + 1; space++) {
                System.out.print(" ");
            }
            for (int slash = 1; slash <= line - 1; slash++) {
                System.out.print("/");

            }
            System.out.print("*");
            for (int backSlash = 1; backSlash <= line - 1; backSlash++) {
                System.out.print("\\");
            }
            for (int space = 1; space <= -line + SIZE + 1; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void bottom() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            for (int space = 1; space <= line; space++) {
                System.out.print(" ");
            }
            for (int backslash = 1; backslash <= (SIZE - line); backslash++) {
                System.out.print("\\");

            }
            System.out.print("*");
            for (int slash = 1; slash <= (SIZE - line); slash++) {
                System.out.print("/");
            }
            for (int space = 1; space <= line; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}











