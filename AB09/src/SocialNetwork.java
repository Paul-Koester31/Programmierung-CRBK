import java.io.PipedOutputStream;
import java.util.ArrayList;

public class SocialNetwork {
    ArrayList<Person> members = new ArrayList<>();
    ArrayList<Post> posts = new ArrayList<>();

    public void addmember(Person person) {
        members.add(person);
    }

    public void addpost(Post post) {
        posts.add(post);
    }

    public void printposts() {
        for (int i = 0; i < posts.size(); i++) {
            System.out.println(posts.get(i).toString());
        }

    }
}
