import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Pkw p1 = new Pkw("Lightning McQueen", "C6 Chevrolet Corvette", new Fronthaube("Rot"));
        Pkw p3 = new Pkw("Lightning McQueen", "C6 Chevrolet Corvette", new Fronthaube("Rot"));
        Fronthaube front = new Fronthaube("Blau");
        Pkw p2 = new Pkw("Doc Hudson", "Hudson Hornet Coupe", front);



        System.out.println(p1.equals(p3));
    }


}