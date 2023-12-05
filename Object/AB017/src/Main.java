public class Main {
    public static void main(String[] args) {
        Adresse adr = new Adresse(1, "Much", "Straße", "DE");
        Schueler s1 = new Schueler(12L, "Louis", "1.3.2001", 1.10, adr);
        Schueler s2 = new Schueler(12L, "Louis", "1.3.2001", 1.10, adr);
        Schueler s3 = new Schueler(12L, "Andrei", "1.2.2010", 1.90, new Adresse(123, "Hennef", "Schulenstraße", "DE"));

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}