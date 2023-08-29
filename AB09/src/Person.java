public class Person {
    private String vorname;
    private String nachname;

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public Person() {
    }

    public Person(String vorname, String nachname) {
        this.nachname = nachname;
        this.vorname = vorname;
    }
}
