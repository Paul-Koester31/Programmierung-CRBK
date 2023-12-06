

public class Schueler extends Person {

    private long sID;


    public Schueler(long sID, String name, String gebDat, Double groesse) {
        super(name, gebDat, groesse);
        this.sID = sID;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Schueler schueler)) return false;
        if (!super.equals(o)) return false;
        return sID == schueler.sID;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this;
    }
}
