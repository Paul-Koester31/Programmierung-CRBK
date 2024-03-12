public class Main {
    public static void main(String[] args) {
        Blubb b = new Blubb();

        CustomThread t1 = new CustomThread("erster Fred", b, true);
        CustomThread t2 = new CustomThread("zweiter Fred", b, false);
        /*CustomThread t3 = new CustomThread("dritter Fred");
        CustomThread t4 = new CustomThread("vierter Fred");
        CustomThread t5 = new CustomThread("fünfter Fred");*/

        t1.start();
        t2.start();
        /*t3.start();
        t4.start();
        t5.start();*/
        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Programmende");
    }
}
