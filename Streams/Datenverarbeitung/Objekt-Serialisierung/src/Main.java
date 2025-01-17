import java.io.*;

public class Main {
    public static void main(String[] args) {
        User u = new User("MaxiMustermann","mmusti@lycos.com");
        User user = new User("MaxiMustermann2","mmusti@lycos.com");
        File f = new File("user.obj");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(f);
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(u);
            oos.writeObject(user);
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        User u1;
        User u2;
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            u1= (User) ois.readObject();
            u2= (User) ois.readObject();
            ois.close();
            System.out.println(u1.getUsername());
            System.out.println(u2.getUsername());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}