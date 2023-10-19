public class ZutatTest1 {
    public static void main(String[] args) {
        Zutat z = new Zutat("Zwiebeln", 10);

        ZutatenVerarbeiten verarbeiten = (zutat, anzahl) -> {
            if (zutat.anzahl < anzahl) {
                int dif = anzahl - zutat.anzahl;
                System.out.println("Zu wenig " + zutat.getName() + ", es fehlen " + dif);
                return false;
            } else
                zutat.anzahl -= anzahl;
            System.out.println("Schneide " + anzahl + " " + zutat.getName());
            return true;
        };
        verarbeiten.schneiden(z, 6);
        verarbeiten.schneiden(z, 6);
    }

}
