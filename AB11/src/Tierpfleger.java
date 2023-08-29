public class Tierpfleger {
    private String vorname;
    private String nachname;

    public Tierpfleger() {
    }

    public Tierpfleger(String vorname, String nachname) {
        this.nachname = nachname;
        this.vorname = vorname;
    }

    @Override
    public String toString() {
        return this.vorname + " " + this.nachname;
    }
}
