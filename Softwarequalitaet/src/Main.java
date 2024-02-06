import javax.swing.*;

public class Main {
    static JFrame frame = new JFrame();
    static JTextField zahl1 = new JTextField();
    static JTextField zahl2 = new JTextField();
    static JTextField print = new JTextField();
    static JButton btn = new JButton();

    public static void main(String[] args) {
        gui();
    }

    public static void gui() {

        frame.setVisible(true);
        frame.setSize(300, 250);
        frame.add(zahl1);
        frame.add(zahl2);
        frame.add(print);
        frame.add(btn);
        frame.setLayout(null);

        zahl1.setBounds(20, 20, 60, 30);
        zahl2.setBounds(100, 20, 60, 30);
        print.setBounds(20, 80, 60, 30);
        print.setEditable(false);
        btn.setBounds(20, 140, 80, 60);
        btn.setText("Add");
        btn.addActionListener(e -> {
            int a = Integer.parseInt(zahl1.getText());
            int b = Integer.parseInt(zahl2.getText());
            print.setText(a + "+" + b + "=" + (a + b));
        });
    }
}