public class Kampfflugzeug extends Flugobjekt {
    private int anzahltRaketen;

    public Kampfflugzeug() {
    }

    public Kampfflugzeug(String name, int gewicht, int raketen) {
        super(name, gewicht);
        this.anzahltRaketen = raketen;
    }
}
