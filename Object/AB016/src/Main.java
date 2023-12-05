public class Main {
    public static void main(String[] args) {
        Schueler s1 = new Schueler(12L, "Louis", "1.3.2001", 1.10);
        Schueler s2 = new Schueler(12L, "Louis", "1.3.2001", 1.10);
        Schueler s3 = new Schueler(12L,"Andrei","1.2.2010",1.90);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}