import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            eingabe();
        } catch (ZahlenException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Programm wird beendet");
        }
    }

    public static void eingabe() throws ZahlenException {
        Scanner sc = new Scanner(System.in);
        int eingabe;
        try {
            System.out.println("Geben Sie ihre gerade Zahl ein:");
            eingabe = sc.nextInt();
            if (istGerade(eingabe)) throw new GeradeZahlException("Zahl ist gerade");
            if (!istGerade(eingabe) || istGerade(eingabe)) throw new GeradeUndUngeradeException("Zahl ist gerade oder ungerade");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

    public static boolean istGerade(int zahl) {
        return zahl % 2 == 0;
    }
}