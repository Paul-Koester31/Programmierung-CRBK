import java.io.File;

public class Main {
    public static void main(String[] args) {
        File meinVerz = new File("C:\\");
        File[] dateien = meinVerz.listFiles(f -> f.isFile());
    }

}