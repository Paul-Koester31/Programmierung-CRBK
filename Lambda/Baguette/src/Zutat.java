public class Zutat {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zutat() {
    }

    public Zutat(String name) {
        this.name = name;
    }

    public void zubereiten(ZutatenVerarbeiten z) {
        z.schneiden();
    }
}
