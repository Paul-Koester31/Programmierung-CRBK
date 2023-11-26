import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID=4057375706308532141L;

    private String username;
    private String mail;

    public User(String username, String mail){
        super();
        this.username=username;
        this.mail=mail;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
