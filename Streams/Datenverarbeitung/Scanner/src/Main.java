import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File f = new File("test.txt");
        try {
            Scanner s = new Scanner(f);
            s.useDelimiter(" ");
            while(s.hasNext()){
                System.out.println(s.next());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}