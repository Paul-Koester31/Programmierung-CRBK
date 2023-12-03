import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        sortierenUndSchreiben(auslesen(new File("Datei_Mitarbeiter.csv")));

    }

    public static List<String> auslesen(File filename) {
        List<String> list = new ArrayList<>();
        try {
            FileReader fis = new FileReader(filename);
            BufferedReader bf = new BufferedReader(fis);
            String line = bf.readLine();
            while (line != null) {
                list.add(line);
                line = bf.readLine();
            }
            bf.close();

            return list;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sortierenUndSchreiben(List<String> list) {
        list.sort(Comparator.comparing(line -> Arrays.asList(line.split(",")).get(2)));
        // list.sort(Comparator.comparing(line -> Arrays.asList(line.split(",")).get(3)));
        try {
            FileWriter fw = new FileWriter("Datei_Mitarbeiter_umgekehrtsortiert.csv");
            BufferedWriter bfw = new BufferedWriter(fw);
            for (int i = list.size()-1; i >=0; i--) {
                bfw.write(list.get(i)+"\n");
                System.out.println(list.get(i));
            }
            bfw.close();
            //Files.write(Path.of("Datei_Mitarbeiter_sortiert_2.csv"), list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}