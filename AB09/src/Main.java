public class Main {
    public static void main(String[] args) {
        Person a = new Person("Martin", "Braun");
        Post b = new Post("test");
        SocialNetwork test = new SocialNetwork();
        test.addmember(a);
        test.addpost(b);
        test.printposts();
    }
}