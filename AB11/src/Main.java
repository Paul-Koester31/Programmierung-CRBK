public class Main {
    public static void main(String[] args) {
        Hund h = new Hund();
        h.setName("Jürgen");
        h.setGewicht(5);

        Futter f = new Futter("le fish au chocolat");
        Fressnapf napf = new Fressnapf(f);

        h.fressen(napf);

        Tierheim th = new Tierheim();
        th.addpfleger(new Tierpfleger("Gandalf", "der Graue"));
        th.addpfleger(new Tierpfleger("Olaf", "Schmolz"));
        th.addpflegehund(h);

        System.out.println(th.getPfleger().toString());
        System.out.println(th.getPflegehunde().toString());

        h.addlieblingsfutter(new Futter("Sülze"));
        h.addlieblingsfutter(f);
        System.out.println(h.getLieblingsfutter().toString());

        h.addlieblingsspielzeug("Knochen");
        h.addlieblingsspielzeug("Jochen");
        h.addlieblingsspielzeug("Rochen");

        System.out.println(h.getLieblingsspielzeug().toString());

    }
}