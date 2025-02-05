import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> add2Funktion = number -> number + 2;
        Function<Integer, Integer> mult3 = number -> number * 3;
        Consumer<String> swem = s -> System.out.println(s+"!");

       // swem.accept("Test");

        List<String> students = List.of("Peter","Paul","Marie");
        //students.forEach(swem);

        //Test-Input=?-Output=boolean
        Predicate<String> studentTest = student -> student.startsWith("M");
        System.out.println(studentTest.test(students.get(1)));


        Supplier<Double> random1000= () -> Math.random()*1000;
        System.out.println(random1000.get());

        //System.out.println(studentTest.test(students.get(2)));
        //System.out.println(students.stream().anyMatch(studentTest));

        //System.out.println(add2Funktion.apply(4));
        //System.out.println(add2Funktion.andThen(mult3).apply(4));;

        /*List<String> students = new ArrayList<>();

        String student = students.stream()
                .filter(fStudent -> fStudent.startsWith("M"))
                .map(str -> str + " is a match!")
                .findAny()
                .or(() -> Optional.of("Default student"))
                .get();*/
    }

    public static int add2method(int number) {
        return number + 2;
    }
}