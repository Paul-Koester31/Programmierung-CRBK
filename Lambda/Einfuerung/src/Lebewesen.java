@FunctionalInterface
public interface Lebewesen {
    /*
    Functional Interface darf nur eine abstrakte Methode haben, jedoch darf sie weitere
    Methoden haben, die entweder statisch oder default sind.
     */
    void macheEtwas();

    default void meineDefautMethode() {
        System.out.println("Ich bin eine Defaultmethode");
    }

    static void meineStatischeMethode() {
        System.out.println("Ich bin eine Statischemethode");
    }

}
