public class Bankkonto {
    private int balance;
    private int id;

    public Bankkonto() {
    }

    public Bankkonto(int initialBalance) {
        balance = initialBalance;
        this.id = Bank.konten.size() + 1;
        System.out.println("Konto wurde erstellt mit der ID: " + id + " und dem Kontostand:" + balance);
    }

    public void transfer(int targetid, int amount) {
        Bank.getAccount(targetid).balance=Bank.getAccount(targetid).getBalance()+amount;
        this.balance = this.balance - amount;
    }

    public int getBalance() {
        return balance;
    }
}
