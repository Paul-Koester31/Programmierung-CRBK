import java.util.Objects;

public class Bankkonto {
    private String IBAN;

    public Bankkonto(){}

    public Bankkonto(String iban){
        this.IBAN=iban;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bankkonto bankkonto)) return false;
        return Objects.equals(IBAN, bankkonto.IBAN);
    }


}
