import java.util.ArrayList;
import java.util.List;

public class Bank {
    static List<Bankkonto> konten = new ArrayList<>();

    public Bank() {
    }

    public void createAccount(int initialBalance) {
        konten.add(new Bankkonto(initialBalance));
    }

    public static Bankkonto getAccount(int id) {
        return konten.get(id - 1);
    }
}
