public class RandomShape {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        line();
        top();
        bottom();
    }

    public static void line() {
        dash();
    }

    public static void top() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            space(line);
            System.out.print("<>");
            for (int dot = 0; dot < 4 * line - SIZE; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            space(line);
            System.out.println("|");
        }
        }

    public static void space(int line){
        for (int space = 1; space<=-2 * line + 2 * SIZE; space ++){
            System.out.print(" ");
        }
    }




        public static void bottom(){
        for(int line =1; line <=SIZE; line ++){
            System.out.print("|");
            space2(line);
            System.out.print("<>");
            for (int dot = 1; dot <= -4 * line + SIZE*4; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            space2(line);
            System.out.println("|");
        }
        }

    public static void space2(int line) {
        for (int space = 1; space <= line *2-SIZE/2; space++)
        {
            System.out.print(" ");
        }
    }
        public static void dash(){
            System.out.print("#");
            for(int dash =0; dash< SIZE*4; dash++)
            {
                System.out.print("=");
            }
            System.out.println("=");
        }

}
