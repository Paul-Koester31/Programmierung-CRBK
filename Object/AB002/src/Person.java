import java.util.Objects;

public abstract class Person {
    private String name;
    private String gebDat;
    private Double groesse;

    public Person() {
    }

    public Person(String name, String gebDat, Double groesse) {
        this.name = name;
        this.gebDat = gebDat;
        this.groesse = groesse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(gebDat, person.gebDat) && Objects.equals(groesse, person.groesse);
    }

    public String getName() {
        return name;
    }

    public String getGebDat() {
        return gebDat;
    }

    public Double getGroesse() {
        return groesse;
    }

}
