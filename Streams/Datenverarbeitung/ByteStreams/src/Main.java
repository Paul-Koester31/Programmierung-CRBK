import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String s = "Ich habe eine Schlange im Stiefel"; //String erzeugen
        File f = new File("test.txt"); //File-Objekt erzeugen

        try {
            FileOutputStream fos = new FileOutputStream(f); //FileOutputStream erzeugen und den File dem Konstruktor übergeben
            fos.write(s.getBytes()); // String als byte-Array in den Strom schreiben
            fos.close(); //Strom schließen
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}