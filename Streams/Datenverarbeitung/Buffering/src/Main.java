import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String s = "Ich hab ne Schlange im Stiefel";
        File f = new File("test.txt");
        buff(f,s);
        nonbuff(f,s);

    }
    public static void nonbuff(File f,String s){
        long anfang = System.currentTimeMillis();
        try {
            FileWriter fw = new FileWriter(f);
            for (int i = 0; i <= 100000; i++) {
                fw.write(s);
            }
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long ende = System.currentTimeMillis();
        System.out.println("Anfang: "+anfang);
        System.out.println("Ende: "+ende);
        System.out.println("Zeit: "+(ende-anfang));
    }
    public static void buff(File f,String s){
        long anfang = System.currentTimeMillis();
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i <= 100000; i++) {
                bw.write(s);
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long ende = System.currentTimeMillis();
        System.out.println("Anfang: "+anfang);
        System.out.println("Ende: "+ende);
        System.out.println("Zeit: "+(ende-anfang));
    }
}