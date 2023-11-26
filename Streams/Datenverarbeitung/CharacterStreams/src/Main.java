import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String s = "Ich habe `ne schlange im Stiefel";
        File f = new File("test.txt");

        try {
            FileWriter writer = new FileWriter(f);
            writer.write(s);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}