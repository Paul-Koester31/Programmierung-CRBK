public class PorscheTest {
    public static void main(String[] args) {
        Porsche p = new Porsche();

        Emissionen emissionen = gasPedalstellung -> {
            if (gasPedalstellung <= 70) {
                return "Emissionen im grünen Bereich";
            } else
                return "Emission im roten Bereich";
        };

        abfahrt(p, emissionen);

    }

    public static void abfahrt(Fahren f, Emissionen e) {
        f.fahren();
        System.out.println(e.vollGasEmissionen(90));
    }
}