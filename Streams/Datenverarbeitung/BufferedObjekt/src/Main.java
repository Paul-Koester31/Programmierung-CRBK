import java.io.*;

public class Main {
    public static void main(String[] args) {
        User u = new User("MaxiMustermann", "mmust@lycos.com");


        //Serialisierung und schreiben eines Objektes in eine Datei
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("user.obj")))) {
            oos.writeObject(u);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File f = new File("user.obj");
            FileInputStream fis = new FileInputStream(f);

            //BufferedInputStream b = new BufferedInputStream(fis);

            //DataInputStream arbeiten byte orientiert und buffered (weniger ressourcen -> shcneller)
            InputStream buffer = new DataInputStream(fis);
            ObjectInputStream in = new ObjectInputStream(buffer);
            u = (User) in.readObject();
            in.close();
            fis.close();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}