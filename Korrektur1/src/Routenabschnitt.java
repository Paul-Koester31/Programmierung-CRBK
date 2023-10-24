public class Routenabschnitt {
    private String straßenname;
    private double anfangspunkt;
    private double endpunkt;

    public Routenabschnitt() {

    }

    public Routenabschnitt(String straßenname, double anfangspunkt, double endpunkt) {
        this.anfangspunkt = anfangspunkt;
        this.straßenname = straßenname;
        this.endpunkt = endpunkt;
    }
}
