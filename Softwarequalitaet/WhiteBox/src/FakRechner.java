import java.util.Scanner;

public class FakRechner {
    static int zahl =1;

    public static void main(String[] args) {
        test.teste();
        try {
            Scanner sc = new Scanner(System.in);
            zahl = Integer.parseInt(sc.next());
            if (zahl<0) throw new Exception("Zahl ist kleiner als 0");
        } catch (NumberFormatException e) {
            System.out.println("Zahl ist kleiner 0 " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(fakRechner(zahl) + "");

    }

    public static int fakRechner(int zahl) {
        int fakzahl = 1;
        for (int i = 1; i <= zahl; i++) {
            fakzahl *= i;
        }
        return fakzahl;
    }
}