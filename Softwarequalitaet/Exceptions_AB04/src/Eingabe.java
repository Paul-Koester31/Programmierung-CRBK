import javax.swing.*;
import java.util.Scanner;

public class Eingabe {

    static int auswahl = 0;

    public static void main(String[] args) {
        try {
            eingabe();
            switch (auswahl) {
                case 1:
                    Auto a = new Auto();
                    a.starten();
                    a.fahren();
                    break;
                case 2:
                    Motorrad m = new Motorrad();
                    m.starten();
                    m.fahren();
                    break;
                case 3:
                    LKW l = new LKW();
                    l.starten();
                    l.fahren();
                    break;

            }
        } catch (FahrzeugException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Bitte die Geschwindigkeitsbegrenzungen beachten!");
        }
    }

    public static int eingabe() throws FahrzeugException {
        Scanner sc = new Scanner(System.in);
        String eingabe;

        System.out.println("Was für ein Fahrzeug möchten Sie fahren?\n1-Auto\n2-Motorrad\n3-LKW");
        try {
            eingabe = sc.next();
            if (!eingabe.equals("1") && !eingabe.equals("2") && !eingabe.equals("3"))
                throw new InvalidInputException("Fehler bei Eingabe");
            auswahl = Integer.parseInt(eingabe);
            return auswahl;
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
        return auswahl;
    }
}