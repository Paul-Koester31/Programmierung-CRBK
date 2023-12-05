import java.util.ArrayList;
import java.util.Objects;

public class Schueler extends Person {

    private long sID;

    private ArrayList<Adresse> adressen = new ArrayList<>();


    public Schueler(long sID, String name, String gebDat, Double groesse, Adresse adresse1) {
        super(name, gebDat, groesse);
        adressen.add(adresse1);
        this.sID = sID;
    }

    public Schueler(long sID, String name, String gebDat, Double groesse, Adresse adresse1, Adresse adresse2) {
        super(name, gebDat, groesse);
        adressen.add(adresse1);
        adressen.add(adresse2);
        this.sID = sID;
    }

    public Schueler(long sID, String name, String gebDat, Double groesse, Adresse adresse1, Adresse adresse2, Adresse adresse3) {
        super(name, gebDat, groesse);
        adressen.add(adresse1);
        adressen.add(adresse2);
        adressen.add(adresse3);
        this.sID = sID;
    }

    public Schueler(long sID, String name, String gebDat, Double groesse, Adresse adresse1, Adresse adresse2, Adresse adresse3, Adresse adresse4) {
        super(name, gebDat, groesse);
        adressen.add(adresse1);
        adressen.add(adresse2);
        adressen.add(adresse3);
        adressen.add(adresse4);
        this.sID = sID;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Schueler schueler = (Schueler) o;
        return sID == schueler.sID && Objects.equals(adressen,((Schueler) o).adressen);
    }

}
