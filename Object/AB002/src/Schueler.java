import java.util.ArrayList;
import java.util.Objects;

public class Schueler extends Person {

    private long sID;

    private ArrayList<Adresse> adressen = new ArrayList<>();

    private ArrayList<Bankkonto> bankkonto = new ArrayList<>();

    public Schueler(long sID, String name, String gebDat, Double groesse, ArrayList<Adresse> adressen) {
        super(name, gebDat, groesse);
        this.adressen = adressen;
        this.sID = sID;
    }

    public Schueler(long sID, String name, String gebDat, Double groesse, ArrayList<Adresse> adressen, ArrayList<Bankkonto> bankkonto) {
        super(name, gebDat, groesse);
        this.adressen = adressen;
        this.bankkonto = bankkonto;
        this.sID = sID;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Schueler schueler = (Schueler) o;
        return sID == schueler.sID && Objects.equals(adressen, schueler.adressen);
    }

    public Object clone() {
        if (getBankkonto() != null)
            return new Schueler(getsID(), getName(), getGebDat(), getGroesse(), getAdressen(), getBankkonto());
        else
            return new Schueler(getsID(), getName(), getGebDat(), getGroesse(), getAdressen());
    }

    public long getsID() {
        return sID;
    }

    public ArrayList<Adresse> getAdressen() {
        return adressen;
    }

    public ArrayList<Bankkonto> getBankkonto() {
        return bankkonto;
    }
}
