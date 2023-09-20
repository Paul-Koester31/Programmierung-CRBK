public class ZutatTest1 {
    public static void main(String[] args) {
        Zutat z = new Zutat();

        z.zubereiten(new ZutatenVerarbeiten() {
            @Override
            public void schneiden() {
                System.out.println("Schneide Zwiebeln");

            }
        });
    }
}
