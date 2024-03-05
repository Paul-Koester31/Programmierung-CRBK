public class LKW extends Fahrzeug{
    @Override
    public void starten() {
        System.out.println("Ein LKW wurde gestartet!");
    }

    @Override
    public void fahren() {
        System.out.println("Der LKW fährt!");
    }
}
