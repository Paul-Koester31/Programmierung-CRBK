import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Lebewesen elefant = new Lebewesen() {
            @Override
            public void macheEtwas() {
                System.out.println("Töröö");
            }
        };
        Lebewesen katze = () -> System.out.println("Mau");

        elefant.macheEtwas();
        katze.macheEtwas();

        Lebewesen2 hund = s -> System.out.println(s + " Wau");
        hund.macheEtwas("Hund macht :");

        Lebewesen3 Anglerfisch = (v, n) -> {
            System.out.println(v + "Blub");
            System.out.println(v + "Blub" + n);
        };
        Anglerfisch.macheEtwas("Der Fisch macht ", " und schwimmt weiter");

        Lebewesen4 Stirnlappenbasilisk = (v, n) -> v +"splash"+ n;
        System.out.println(Stirnlappenbasilisk.macheEtwas("Stirnlappenbasilisk macht ", " !!!"));

        Lebewesen4 katze1= new Katze();
        rufeMethodeAuf(katze1);

    }

    public static void rufeMethodeAuf(Lebewesen4 lebewesen){
        String s = lebewesen.macheEtwas("Das Lebewesen sagt: ","!!!");
        System.out.println(s);
    }

}