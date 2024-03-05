public class Motorrad extends Fahrzeug{
    @Override
    public void starten() {
        System.out.println("Ein Motorrad wurde gestartet!");
    }

    @Override
    public void fahren() {
        System.out.println("Das Motorrad fährt!");
    }
}
