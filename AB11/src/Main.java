public class Main {
    public static void main(String[] args) {
        Hund h1 = new Hund();
        h1.setName("Jürgen");
        h1.setGewicht(5);

        Hund h2 = new Hund();
        h2.setName("Smitty Werben jaggerman Janson");
        h2.setGewicht(50);


        Futter f1 = new Futter("le fish au chocolat");
        Futter f2 = new Futter("Sülze");
        h1.addlieblingsfutter(f2);
        h1.addlieblingsfutter(f1);

        Fressnapf napf = new Fressnapf(f1);
        h1.fressen(napf);

        Tierheim th = new Tierheim();
        th.addpfleger(new Tierpfleger("Gandalf", "der Graue"));
        th.addpfleger(new Tierpfleger("Olaf", "Schmolz"));
        th.addpflegehund(h1);
        th.addpflegehund(h2);

        System.out.println("Tierpfleger ->" + th.getPfleger().toString());
        System.out.println("Pflegehunde ->" + th.getPflegehunde().toString());


        System.out.println("Lieblingsfutter ->" + h1.getLieblingsfutter().toString());

        h1.addlieblingsspielzeug("Knochen");
        h1.addlieblingsspielzeug("Jochen");
        h1.addlieblingsspielzeug("Rochen");
        for (int i = 0; i < h1.getLieblingsspielzeug().length; i++) {
            System.out.println("Lieblingspielzeug " + (i + 1) + "->" + h1.getLieblingsspielzeug()[i]);
        }

    }
}