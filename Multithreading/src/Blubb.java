public class Blubb {
    boolean flag = false;
    boolean flag2 = true;

    public synchronized void first() {
        if (flag2) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println("Ich bin der erste.");
        flag2 = true;
        flag = true;
        notify();
    }

    public synchronized void second() {
        if (!flag2) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println("Ich bin der zweite.");
        flag2 = false;
        flag = false;
        notify();
    }
}
