import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;

public class Main {
    public static void main(String[] args) {
        ArrayList<Schueler> schuelers = new ArrayList<>();
        Schueler s1 = new Schueler("Martin", "1.1.2004", 1.13, 1L);
        Schueler s2 = new Schueler("Robin", "1.2.2004", 1.73, 2L);
        Schueler s3 = new Schueler("An2", "1.3.2004", 1.83, 3L);
        Schueler s4 = new Schueler("Mihai", "1.4.2004", 1.83, 4L);
        Schueler s5 = new Schueler("Ludwig", "1.5.2004", 2.83, 5L);
        schuelers.add(s1);
        schuelers.add(s2);
        schuelers.add(s3);
        schuelers.add(s4);
        schuelers.add(s5);
        File f = new File("schueler.obj");

        try (FileOutputStream fos = new FileOutputStream(f)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (int i = 0; i < schuelers.size(); i++) {
                oos.writeObject(schuelers.get(i));
            }
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Schueler s;
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            s = (Schueler) ois.readObject();
            System.out.println(s.toString());
            ois.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}