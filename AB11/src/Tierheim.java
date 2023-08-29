import java.util.ArrayList;

public class Tierheim {
    private ArrayList<Tierpfleger> pfleger = new ArrayList<>();
    private ArrayList<Hund> pflegehunde = new ArrayList<>();

    public Tierheim() {
    }

    public void addpfleger(Tierpfleger neuerpleger) {
        pfleger.add(neuerpleger);
    }

    public void addpflegehund(Hund pflegehund) {
        pflegehunde.add(pflegehund);
    }

    public ArrayList<Hund> getPflegehunde() {
        return pflegehunde;
    }

    public ArrayList<Tierpfleger> getPfleger() {
        return pfleger;
    }
}
