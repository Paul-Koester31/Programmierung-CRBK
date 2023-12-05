import java.util.Objects;

public class Fronthaube {
    String farbe;

    public Fronthaube() {
    }

    public Fronthaube(String farbe) {
        this.farbe = farbe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fronthaube that = (Fronthaube) o;
        return Objects.equals(farbe, that.farbe);
    }

}
