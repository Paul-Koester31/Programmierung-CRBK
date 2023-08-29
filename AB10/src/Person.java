import java.util.HashSet;

public class Person {
    private String vorname;
    private String nachname;
    private HashSet<Person> friends = new HashSet<>();

    public Person() {
    }

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public HashSet<Person> getFriends() {
        return friends;
    }

    public void addFriend(Person p) {
        friends.add(p);
    }

    @Override
    public String toString() {
        return this.vorname+" "+this.nachname;
    }
}
