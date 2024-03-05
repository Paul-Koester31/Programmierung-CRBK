public class Auto extends Fahrzeug{

    public Auto(){

    }
    @Override
    public void starten() {
        System.out.println("Ein Auto wurde gestartet!");
    }

    @Override
    public void fahren() {
        System.out.println("Das Auto fährt!");
    }
}
