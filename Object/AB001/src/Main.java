public class Main {
    public static void main(String[] args) {
        Schueler s1 = new Schueler(12L, "Alfred", "1.1.2001", 2.10);
        Schueler s2=null;
        Schueler s3 = new Schueler(12L, "Alonzo", "1.2.2001", 3.10);
        try {
             s2 = (Schueler) s1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}