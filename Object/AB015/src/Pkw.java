import java.util.Objects;

public class Pkw extends Fahrzeug {
    private String name;
    private Fronthaube fronthaube;

    public Pkw() {
    }

    public Pkw(String name, String typ, Fronthaube fronthaube) {
        super(typ);
        this.fronthaube = fronthaube;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pkw pkw)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(name, pkw.name) && Objects.equals(fronthaube, pkw.fronthaube);
    }


}
