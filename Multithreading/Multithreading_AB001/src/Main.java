public class Main {
    public static void main(String[] args) {
        int min = 40;
        int max = 400;

        Bank ING = new Bank();
        ING.createAccount(300);

        ING.createAccount(1000);
        System.out.println("Neuer Kontostand: "+Bank.getAccount(2).getBalance());
        Transaction t1 = new Transaction("Kunde1", 1);
        Transaction t2 = new Transaction("Kunde2", 2);
        t1.run(2, 50);
        System.out.println("Neuer Kontostand: "+Bank.getAccount(2).getBalance());
        System.out.println("Neuer Kontostand: "+Bank.getAccount(1).getBalance());
       // t2.run(1, 300);
    }
}