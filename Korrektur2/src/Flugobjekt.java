import java.util.Objects;

public class Flugobjekt {
    private String name;
    private int gewicht;

    public Flugobjekt() {
    }

    public Flugobjekt(String name, int gewicht) {
        this.name = name;
        this.gewicht = gewicht;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flugobjekt that = (Flugobjekt) o;
        return gewicht == that.gewicht && Objects.equals(name, that.name);
    }

    public Object clone() {
        return new Flugobjekt(this.name, this.gewicht);
    }


}
