
import java.util.Scanner;
public class SeattleTower {
    public static final int SIZE = 13;
    public static void main(String[] args) {


        line();
        top();
        anotherLine();
        bottom();
        line();
        shaft();
        top();
        anotherLine();
    }

    public static void line() {
        for (int line = 1; line <= 4 * SIZE; line++) {

            for (int space = 1; space <= 12 * SIZE; space++) {
                System.out.print(" ");
            }
            for (int lines = 1; lines <= SIZE; lines++) {
                System.out.print("||");
            }
            System.out.println();
        }
    }

    public static void top() {
        for (int line = 1; line <= 4 * SIZE; line++) {
        for (int space = 1; space<= (12* SIZE) -(3*line); space++){
            System.out.print(" ");


        }
        System.out.print("__/");

        for(int colon =1; colon <= 3 * (line -1); colon++ ){
            System.out.print(":");
        }
        for(int lines = 1; lines <= SIZE; lines++){
            System.out.print("||");
        }
            for(int colon =1; colon <= 3 * (line -1); colon++ ){
                System.out.print(":");
            }

            System.out.println("\\__");

        }

    }

    public static void anotherLine() {

        for(int outsideLines =1; outsideLines <= SIZE; outsideLines++){
            System.out.print("|");
        }
        for(int dashes =1; dashes<= 24*SIZE; dashes++){
            System.out.print("\"");
        }
        for(int outsideLines =1; outsideLines <= SIZE; outsideLines++){
            System.out.print("|");
        }
        System.out.println();
    }

    public static void bottom(){
int space = 0;
        for(int line = 1; line <= 4*SIZE; line++ ){
            for(int space2 = space; space2 > 0; space2--){
                System.out.print(" ");
            }
            System.out.print("\\_/");
            for(int v = 1; v <= ((26*SIZE)-((space*2)+6))/2; v++){
                System.out.print("\\/");

            }
            System.out.println("\\_/");
            space+=2;
        }


    }

    public static void shaft() {
        for (int line = 1; line <= 16 * SIZE; line++) {

            for (int space = 1; space <= 9 * SIZE; space++) {
                System.out.print(" ");
            }
            for(int endlines =1; endlines <= SIZE; endlines++){
                System.out.print("|");
            }
            for(int percent =1; percent <= SIZE; percent++){
                System.out.print("%%");
            }
            for(int midline =1; midline <= SIZE; midline++){
                System.out.print("||");
            }
            for(int percent =1; percent <= SIZE; percent++){
                System.out.print("%%");
            }
            for(int endlines =1; endlines <= SIZE; endlines++){
                System.out.print("|");
            }
            System.out.println();
        }
    }

}