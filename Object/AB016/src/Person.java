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
}
