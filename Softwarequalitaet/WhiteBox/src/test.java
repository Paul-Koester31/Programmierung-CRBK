import java.nio.file.FileAlreadyExistsException;

public class test {
    public static void teste() {
        int result = FakRechner.fakRechner(2);
        assert result == 2;
        assert FakRechner.fakRechner(5) == 120;
        assert FakRechner.fakRechner(6) == 720;
        assert FakRechner.zahl >= 0;

    }
}
