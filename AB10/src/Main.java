public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jar-Jar","Bings");
        Person p2 = new Person("Bob","Marley");

        p1.addFriend(p2);
        p1.getFriends();
    }
}