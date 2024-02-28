import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Double zahl1=0.0;
    static Double zahl2=0.0;
    public static void main(String[] args) {
        System.out.println("Geben Sie zwei Zahlen hintereinander ein, die Sie dividieren möchten.");

        try{
            zahl1=Double.parseDouble(sc.next());
            zahl2=Double.parseDouble(sc.next());
            if (zahl2==0.0) throw new NumberFormatException();
            System.out.println(DivRechner.dividiere(zahl1,zahl2));
        }catch (NumberFormatException e){
            System.out.println(e.getMessage()+" Bitte folgendes Zahlenformat verwenden: 2.0");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage()+" Es gab einen Fehler!");
        }finally {
            System.out.println("Mathe ist SUPER!!!");
        }
    }
}