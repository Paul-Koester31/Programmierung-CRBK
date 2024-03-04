public class Test {
    public static void test() {
        assert Taschenrechner.plusrechnen(2,3)==5;
        assert Taschenrechner.minusrechnen(7,3)==4;
        assert Taschenrechner.malrechnen(2,3)==6;
        assert Taschenrechner.geteiltrechnen(9,3)==3;
        assert Taschenrechner.quadratrechnen(3)==9;
        assert Taschenrechner.wurzelrechnen(9)==3;
        assert Taschenrechner.fakRechner(5)==120;
    }
}
