import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        sortierenundSchreiben(auslesen("Datei_Mitarbeiter.csv"));

    }

    public static List<String> auslesen(String filename) {
        List<String> list = null;
        try (Stream<String> lines = Files.lines(Path.of(filename))) {
            list = lines.filter(line -> line.contains(",")).collect(Collectors.toList());
            return list;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sortierenundSchreiben(List<String> list) {
        list.sort(Comparator.comparing(line -> Arrays.asList(line.split(",")).get(2)));
        list.forEach(System.out::println);
        try {
            Files.write(Path.of("Datei_Mitarbeiter_sortiert.csv"),list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}