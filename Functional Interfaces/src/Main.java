import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        String student = students.stream()
                .filter(fStudent -> fStudent.startsWith("M"))
                .map(str -> str + " is a match!")
                .findAny()
                .or(()-> Optional.of("Default student"))
                .get();
    }
}