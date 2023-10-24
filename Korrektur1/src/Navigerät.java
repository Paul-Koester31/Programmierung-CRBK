import java.util.ArrayList;

public class Navigerät {
    public double gerätetemperatur;
    public ArrayList<Route> routenliste;

    public Navigerät() {
    }

    public void addRoute(Route r) {
        routenliste.add(r);
    }
}
