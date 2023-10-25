public class PorscheTest {
    public static void main(String[] args) {
        Porsche p = new Porsche();

        Emissionen emissionen = gasPedalstellung -> {
            if (gasPedalstellung <= 70) {
                return "Emissionen im grünen Bereich";
            } else
                return "Emission im roten Bereich";
        };

        Fahren fahren = porsche -> System.out.println("Need for Speed!");
        abfahrt(p, fahren, emissionen);

    }

    public static void abfahrt(Porsche p, Fahren f, Emissionen e) {
        f.fahren(p);
        System.out.println(e.vollGasEmissionen(90));
    }
}