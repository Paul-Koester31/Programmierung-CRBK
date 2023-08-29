public class Post {
    private String post;

    public String getPost() {
        return post;
    }

    public Post(String post) {
        this.post = post;
    }

    public Post() {
    }

    @Override
    public String toString() {
        return this.post;
    }
}
