import java.util.Objects;

public abstract class Fahrzeug {
    private String typ;

    public Fahrzeug(){}

    public Fahrzeug(String typ){
        this.typ=typ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fahrzeug fahrzeug = (Fahrzeug) o;
        return Objects.equals(typ, fahrzeug.typ);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public String getTyp() {
        return typ;
    }
}
