import java.io.Serializable;

public class Schueler extends Person implements Serializable {
    long sID;

    public Schueler(String name, String gebdat, Double groesse, Long sID) {
        super();
        this.sID = sID;
        this.name = name;
        this.gebDat = gebdat;
        this.groesse = groesse;

    }

    @Override
    public String toString() {
        return "Schueler{" +
                " sID=" + this.sID +
                " | Name=" + this.name +
                " | Geburtsdatum=" + this.gebDat +
                " | Größe=" + this.groesse +
                '}';
    }
}
