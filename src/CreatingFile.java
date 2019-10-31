
import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class CreatingFile {
    public static void main(String[] args) throws IOException {

        File inputFile = new File("C:\\Users\\Owner\\IdeaProjects\\Beginning JAVA\\src\\FirstFile");
        Scanner fileScan = new Scanner(inputFile);
        int count =0;
        int word =0;
        double dub = 0;

        while (fileScan.hasNextLine()) {
            String lines = fileScan.nextLine();
            Scanner line = new Scanner(lines);


            while (fileScan.hasNext()) {

                if (line.hasNext()) {
                    int numbers = line.nextInt();
                    count++;


                }
                if(line.hasNext()){
                    double dub = line.nextDouble();
                    dub++;
                }
                else{
                    String word = line.next();
                }

            }

        }
        System.out.println("There are " + count + " numbers, there are " + dub " doubles, and there are " + word " words.");
    }

}

