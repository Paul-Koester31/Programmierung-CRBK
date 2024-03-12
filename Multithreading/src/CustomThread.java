public class CustomThread extends Thread {
    String name;
    Blubb blubb;
    boolean flag;

    public CustomThread(String name, Blubb blubb, boolean flag) {
        this.name = name;
        this.blubb = blubb;
        this.flag = flag;
    }

    public void run() {
        System.out.println("Starte Thread " + name);
        for (int i = 0; i < 5; i++) {
            if (flag)
                blubb.first();
            else
                blubb.second();
        }
        System.out.println("Beende Thread " + name);
    }
}
