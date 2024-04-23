import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Kreis k = new Kreis(4.0);
        Rechteck recht = new Rechteck(5.0, 3.0);
        Dreieck d = new Dreieck(6.0, 10.0);

        Geometrierechner<Kreis> geokreis = (kreis) -> Math.PI * (kreis.radius * kreis.radius);
        Geometrierechner<Rechteck> georecht = (rechteck) -> (rechteck.a * rechteck.b);
        Geometrierechner<Dreieck> geodrei = (dreieck) -> (dreieck.g * dreieck.h) / 2;

        System.out.println(geokreis.berechne(k));
        System.out.println(georecht.berechne(recht));
        System.out.println(geodrei.berechne(d));


    }
}