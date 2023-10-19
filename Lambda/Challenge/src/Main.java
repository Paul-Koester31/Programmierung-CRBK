public class Main {
    public static void main(String[] args) {
        Rechner plus = (zahl1, zahl2) -> zahl1 + zahl2;
        rechenOperation(plus, 1, 2);

        rechenOperation((zahl1, zahl2) -> zahl1 - zahl2, 1, 6);
        rechenOperation((zahl1, zahl2) -> zahl1 * zahl2, 4, 5);
        rechenOperation((zahl1, zahl2) -> zahl1 / zahl2, 6, 3);

    }

    public static void rechenOperation(Rechner rechner, int zahl1, int zahl2) {
        System.out.println(rechner.rechnen(zahl1, zahl2));
    }
}