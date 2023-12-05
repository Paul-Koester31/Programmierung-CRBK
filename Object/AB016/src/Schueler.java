public class Schueler extends Person {

    private long sID;

    public Schueler() {
    }

    public Schueler(long sID, String name,String gebDat, Double groesse) {
        super(name, gebDat, groesse);
        this.sID = sID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Schueler schueler = (Schueler) o;
        return sID == schueler.sID;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
