public class Transaction extends Thread {
    private String name;
    private int quellID;

    public Transaction(String name, int quellID) {
        this.name = name;
        this.quellID = quellID;
    }

    public void run(int target, int amount) {
        synchronized (Bank.konten.get(target - 1)) {
            Bank.getAccount(quellID).transfer(target - 1, amount);
            System.out.println("Es wurden " + amount + " € an das Konto mit der ID " + target + " überwiesen");

        }

    }
}
