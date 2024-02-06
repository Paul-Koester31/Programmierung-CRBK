import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Passagierflugzeug extends Flugobjekt implements Serializable {
    private int anzahlPlaetze;
    private String typ;
    private ArrayList<Fluggesellschaft> fluggesellschafts;

    public Passagierflugzeug() {
    }

    public Passagierflugzeug(int anzahlPlaetze, String typ, String name, int gewicht, ArrayList<Fluggesellschaft> fluggesellschafts) {
        super(name, gewicht);
        this.anzahlPlaetze = anzahlPlaetze;
        this.typ = typ;
        this.fluggesellschafts = fluggesellschafts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Passagierflugzeug that = (Passagierflugzeug) o;
        return anzahlPlaetze == that.anzahlPlaetze && Objects.equals(typ, that.typ) && Objects.equals(fluggesellschafts, that.fluggesellschafts);
    }


}
