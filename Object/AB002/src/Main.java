import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Adresse adr1 = new Adresse(1, "Much", "Straße", "DE");
        Adresse adr2 = new Adresse(11, "Bonn", "SchuleStraße", "DE");
        ArrayList<Adresse> adressen1= new ArrayList<>();
        adressen1.add(adr1);
        ArrayList<Adresse> adressen2 = new ArrayList<>();
        adressen2.add(adr1);
        adressen2.add(adr2);

        Schueler s1 = new Schueler(12L, "Louis", "1.3.2001", 1.10, adressen1);
        Schueler s2 = new Schueler(12L, "Louis", "1.3.2001", 1.10, adressen1);
        Schueler s3 = new Schueler(12L, "Andrei", "1.2.2010", 1.90, adressen2);
        Schueler s4 = null;
        s4=(Schueler) s3.clone();
        Schueler s5= new Schueler(12L, "Andi", "1.12.2001", 1.50, adressen1, new ArrayList<>(List.of(new Bankkonto("DE0817515093"),new Bankkonto("DE134814871"))));

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s2.equals(s5));
    }
}