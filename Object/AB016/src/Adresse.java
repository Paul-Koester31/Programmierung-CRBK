import java.util.Objects;

public class Adresse {
    private int plz;
    private String ort;
    private String strasse;
    private String land;

    public Adresse() {
    }

    public Adresse(int plz, String ort, String strasse, String land) {
        this.plz = plz;
        this.ort = ort;
        this.strasse = strasse;
        this.land = land;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresse adresse = (Adresse) o;
        return plz == adresse.plz && Objects.equals(ort, adresse.ort) && Objects.equals(strasse, adresse.strasse) && Objects.equals(land, adresse.land);
    }

}
