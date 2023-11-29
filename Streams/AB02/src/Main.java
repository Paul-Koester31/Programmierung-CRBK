import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

            //list = lines.filter(line -> line.contains(",")).collect(Collectors.toList());
            return list;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sortierenUndSchreiben(List<String> list) {
        list.sort(Comparator.comparing(line -> Arrays.asList(line.split(",")).get(2)));
        list.sort(Comparator.comparing(line -> Arrays.asList(line.split(",")).get(3)));
        list.forEach(System.out::println);
        try {
            FileWriter fw = new FileWriter("Datei_Mitarbeiter_sortiert_2.csv");
            BufferedWriter bfw = new BufferedWriter(fw);
            int i =0;
            while(i<list.size()){
                bfw.write(list.get(i));
                i++;
            }
            bfw.close();
            //Files.write(Path.of("Datei_Mitarbeiter_sortiert_2.csv"), list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}