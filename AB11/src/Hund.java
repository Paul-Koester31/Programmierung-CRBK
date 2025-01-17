import java.util.HashSet;

public class Hund extends Vierbeiner {

    private String[] lieblingsspielzeug = new String[3];
    private HashSet<Futter> lieblingsfutter = new HashSet<>();
    public static int hundeZeahler;
    private static final String version = "1.0";

    public Hund() {}

    public Hund(String name, int gewicht) {
        setName(name);
        setGewicht(gewicht);
        lieblingsspielzeug[0] = "";
        lieblingsspielzeug[1] = "";
        lieblingsspielzeug[2] = "";
        hundeZeahler++;
    }

    public void bellen() {
        System.out.println("WAU");
    }

    public void fressen(Fressnapf napf) {
        System.out.println("Hund " + this.getName() + " frisst : " + napf.toString());
    }

    public void addlieblingsfutter(Futter f) {
        lieblingsfutter.add(f);
    }

    public void addlieblingsspielzeug(String spielzeug) {
        for (int i = 0; i < lieblingsspielzeug.length; i++) {
            if (lieblingsspielzeug[i].isBlank()) {
                lieblingsspielzeug[i] = spielzeug;
                break;
            }
        }
    }

    public String[] getLieblingsspielzeug() {
        return lieblingsspielzeug;
    }

    public HashSet<Futter> getLieblingsfutter() {
        return lieblingsfutter;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
