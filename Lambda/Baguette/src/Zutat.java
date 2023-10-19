public class Zutat {
    public String name;
    public int anzahl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zutat() {
    }

    public Zutat(String name,int anzahl) {
        this.name = name;
        this.anzahl=anzahl;
    }

   /* public void zubereiten(ZutatenVerarbeiten z, int anzahl) {
        z.schneiden(anzahl);
    }*/
}
