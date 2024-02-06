import java.io.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Fluggesellschaft> fg = new ArrayList<>();

    public static void main(String[] args) {
        Fluggesellschaft fg1 = new Fluggesellschaft("Condor");
        Fluggesellschaft fg2 = new Fluggesellschaft("Ryanair");
        fg.add(fg1);
        fg.add(fg2);

        Passagierflugzeug pf1 = new Passagierflugzeug(22, "Propeller", "fob1", 55, fg);
        Passagierflugzeug pf2 = new Passagierflugzeug(22, "Propeller", "fob1", 55, fg);
        Passagierflugzeug pf3 = new Passagierflugzeug(32, "Düsen", "fob3", 155, fg);


        if (pf1.equals(pf2)) {
            System.out.println("gleich");
        } else System.out.println("ungleich");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("Flugzeuge.obj")))) {
            oos.writeObject(pf3);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Fluggesellschaft fg3 = (Fluggesellschaft) fg1.clone();

    }

}