import java.util.ArrayList;

public class Route {
    private double länge;
    private double dauer;
    private ArrayList<Routenabschnitt> abschnittListe = new ArrayList<>();

    public Route() {
    }

    public void addAbschnitt(Routenabschnitt r) {
        abschnittListe.add(r);
    }
}
