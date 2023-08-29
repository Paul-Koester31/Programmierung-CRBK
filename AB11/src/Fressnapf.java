public class Fressnapf {
    private Futter futter;

    public Fressnapf(Futter f) {
        this.futter = f;
    }

    @Override
    public String toString() {
        return futter.getName();
    }
}
