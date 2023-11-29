import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Schueler> schuelers = new ArrayList<>();
        Schueler s1 = new Schueler("Martin", "1.1.2004", 1.13, 12L);
        Schueler s2 = new Schueler("Robin", "1.2.2004", 1.73, 22L);
        Schueler s3 = new Schueler("An2", "1.3.2004", 1.83, 32L);
        Schueler s4 = new Schueler("Mihai", "1.4.2004", 1.83, 42L);
        Schueler s5 = new Schueler("Ludwig", "1.5.2004", 2.83, 52L);
        schuelers.add(s1);
        schuelers.add(s2);
        schuelers.add(s3);
        schuelers.add(s4);
        schuelers.add(s5);
        File f = new File("schueler.obj");
        schreiben(f, schuelers);
        lesen(f);
    }

    public static void schreiben(File f, ArrayList<Schueler> schuelers) {

        try (FileOutputStream fos = new FileOutputStream(f)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (int i = 0; i < schuelers.size(); i++) {
                oos.writeObject(schuelers.get(i));
            }
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void lesen(File f) {

        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            FileWriter fw = new FileWriter("schueler.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            while (true) {
                try {
                    Schueler s = (Schueler) ois.readObject();
                    bw.write(s.toString()+"\n");
                    System.out.println(s);

                } catch (EOFException e) {
                    break;
                }
            }

            ois.close();
            bw.close();

        } catch (IOException |
                 ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}


