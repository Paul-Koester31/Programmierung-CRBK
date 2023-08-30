public class Main {
    public static void main(String[] args) {
        Hund h1 = new Hund("Jürgen", 5);


        Hund h2 = new Hund("Smitty Werben jaggerman Janson",50);


        h1.addlieblingsfutter(new Futter("le fish au chocolat"));
        h1.addlieblingsfutter(new Futter("Sülze"));

        Fressnapf napf = new Fressnapf(new Futter("Sülze"));
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

        h2.bellen();
        System.out.println(Hund.hundeZeahler);

    }
}