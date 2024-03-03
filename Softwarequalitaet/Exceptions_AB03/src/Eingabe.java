import java.util.Scanner;

public class Eingabe {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            eingabe();
        } catch (GPSException e) {
            e.printStackTrace();
        }
    }

    public static void eingabe() throws GPSException {
        double länge = 0.0;
        double breite = 0.0;
        String ns = "";
        String wo = "";
        try {
            System.out.println("Geben Sie einen Längengrad ein:");
            länge = Double.parseDouble(sc.next());
            System.out.println("Geben Sie Westen (W) oder Osten (O) für den Längengrad ein:");
            wo = sc.next();
            System.out.println("Geben Sie bitte einen Breitengrad ein:");
            breite = Double.parseDouble(sc.next());
            System.out.println("Geben Sie Norden (N) oder Süden (S) für den Breitengrad ein:");
            ns = sc.next();
            if (!ns.equalsIgnoreCase("s") && !ns.equalsIgnoreCase("n"))
                throw new InvalidCoordinateException("Norden oder Süden muss angegeben werden!");
            if (!wo.equalsIgnoreCase("w") && !wo.equalsIgnoreCase("o"))
                throw new InvalidCoordinateException("Westen doer Osten muss angegben werden!");
            if (breite > 90 || breite < 0) throw new InvalidCoordinateException("Breitengrad fehlerhaft eingegeben!");
            if (länge > 180 || länge < 0) throw new InvalidCoordinateException("Längengrad fehlerhaft eingegeben!");

        } catch (NumberFormatException e) {
            System.out.println("Bitte geben Sie die Grade als ganze Zahlen oder als Kommazahl ein.");
        } finally {
            System.out.println("Kommen Sie sicher an ihr Ziel ");//mit den Koordinaten:\n Länge -> " + länge + " " + ns + "\n Breite -> " + breite + " " + wo);
        }

    }
}