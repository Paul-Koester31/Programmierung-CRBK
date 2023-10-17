public class Katze implements Lebewesen4 {
    public void macheMiau() {
        System.out.println("Miau");
    }

    @Override
    public String macheEtwas(String v, String n) {
        return v + "Miau" + n;
    }
}
