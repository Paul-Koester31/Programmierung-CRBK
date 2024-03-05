import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Taschenrechner extends JFrame implements ActionListener {
    private double zahl1;
    private double zahl2;
    private String rechenart = "";
    private String error = "";

    public Taschenrechner() throws TaschenRechnerException {
        //test durführen
        Test.test();

        //Frame
        this.setSize(300, 600);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.GRAY);
        this.setTitle("Taschenrechner");
        this.setResizable(false);

        //Label
        Font font = new Font("Arial", Font.BOLD, 20);
        JLabel label = new JLabel();
        JLabel wahl = new JLabel();
        JLabel errormassage = new JLabel();

        label.setText("Taschenrechner");
        label.setBounds(30, 40, 300, 50);
        label.setFont(font);

        wahl.setText("Vor Eingabe Rechanart wählen!");
        wahl.setBounds(30, 60, 300, 50);
        wahl.setFont(new Font("Arial", Font.PLAIN, 12));

        errormassage.setFont(new Font("Arial", Font.PLAIN, 12));
        errormassage.setBounds(30, 450, 200, 100);
        errormassage.setForeground(Color.red);
        this.add(errormassage);
        this.add(wahl);
        this.add(label);

        //Eingabefeld
        JTextField text = new JTextField();
        text.setBounds(30, 100, 230, 100);
        text.setFont(new Font("Arial", Font.PLAIN, 20));
        text.setEditable(false);
        this.add(text);

        //Bedienfeld
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton mal = new JButton("\u00D7");
        JButton geteilt = new JButton("\u00F7");
        JButton quadrat = new JButton("x²");
        JButton wurzel = new JButton("√");
        JButton fakultaet = new JButton("Fakultät");
        JButton rechnen = new JButton("Rechnen");

        plus.setFont(font);
        minus.setFont(font);
        mal.setFont(font);
        geteilt.setFont(font);
        quadrat.setFont(font);
        wurzel.setFont(font);
        rechnen.setFont(font);
        fakultaet.setFont(new Font("Arial", Font.BOLD, 14));

        plus.setBounds(30, 250, 50, 50);
        minus.setBounds(90, 250, 50, 50);
        mal.setBounds(30, 310, 50, 50);
        geteilt.setBounds(90, 310, 50, 50);
        quadrat.setBounds(160, 250, 100, 50);
        wurzel.setBounds(160, 310, 100, 50);
        fakultaet.setBounds(160, 370, 100, 50);
        rechnen.setBounds(30, 370, 120, 50);

        this.add(plus);
        this.add(minus);
        this.add(mal);
        this.add(geteilt);
        this.add(quadrat);
        this.add(wurzel);
        this.add(fakultaet);
        this.add(rechnen);


        //Actionlistener
        plus.addActionListener(e -> {
            text.setEditable(true);
            text.setText("0.0 + 0.0");
            rechenart = "p";
        });
        minus.addActionListener(e -> {
            text.setEditable(true);
            text.setText("0.0 - 0.0");
            rechenart = "mi";
        });
        mal.addActionListener(e -> {
            text.setEditable(true);
            text.setText("0.0 \u00D7 0.0");
            rechenart = "ma";
        });
        geteilt.addActionListener(e -> {
            text.setEditable(true);
            text.setText("0.0 \u00F7 0.0");
            rechenart = "g";
        });
        quadrat.addActionListener(e -> {
            text.setEditable(true);
            text.setText("0.0");
            rechenart = "q";
        });
        wurzel.addActionListener(e -> {
            text.setEditable(true);
            text.setText("0.0");
            rechenart = "w";
        });
        fakultaet.addActionListener(e -> {
            text.setEditable(true);
            text.setText("0.0");
            rechenart = "f";
        });
        rechnen.addActionListener(e -> {
            String eingabe = text.getText();

            String[] parts;
            try {
                if (eingabe.isEmpty()) throw new InvalidInputException("Fehlerhafte eingabe");
                switch (rechenart) {
                    case "p":

                        parts = eingabe.split("\\+");
                        zahl1 = Double.parseDouble(parts[0]);
                        zahl2 = Double.parseDouble(parts[1]);
                        text.setText(plusrechnen(zahl1, zahl2) + "");
                        break;
                    case "mi":
                        parts = eingabe.split("\\-");
                        zahl1 = Double.parseDouble(parts[0]);
                        zahl2 = Double.parseDouble(parts[1]);
                        text.setText(minusrechnen(zahl1, zahl2) + "");
                        break;
                    case "ma":
                        parts = eingabe.split("\\u00D7");
                        zahl1 = Double.parseDouble(parts[0]);
                        zahl2 = Double.parseDouble(parts[1]);
                        text.setText(malrechnen(zahl1, zahl2) + "");
                        break;
                    case "g":
                        parts = eingabe.split("\\u00F7");
                        zahl1 = Double.parseDouble(parts[0]);
                        zahl2 = Double.parseDouble(parts[1]);
                        text.setText(geteiltrechnen(zahl1, zahl2) + "");
                        break;
                    case "q":
                        zahl1 = Double.parseDouble(eingabe);
                        text.setText(quadratrechnen(zahl1) + "");
                        break;
                    case "w":
                        zahl1 = Double.parseDouble(eingabe);
                        text.setText(wurzelrechnen(zahl1) + "");
                        break;
                    case "f":
                        zahl1 = Double.parseDouble(eingabe);
                        text.setText(fakRechner(zahl1) + "");
                        break;
                }
                SwingUtilities.invokeLater(() -> this.remove(errormassage));
                this.repaint();

            } catch (NumberFormatException er) {
                error = "Zahlen nicht gültig";
                errormassage.setText(error);
                this.add(errormassage);
            } catch (InvalidInputException ex) {
                error = "Fehler bei Eingabe";
                errormassage.setText(error);
            } finally {
                zahl1 = 0.0;
                zahl2 = 0.0;
                error = "";



            }
        });
    }

    public static double plusrechnen(double zahl1, double zahl2) {
        return zahl1 + zahl2;
    }

    public static double minusrechnen(double zahl1, double zahl2) {
        return zahl1 - zahl2;
    }

    public static double malrechnen(double zahl1, double zahl2) {
        return zahl1 * zahl2;
    }

    public static double geteiltrechnen(double zahl1, double zahl2) {
        return zahl1 / zahl2;
    }

    public static double quadratrechnen(double zahl1) {
        return zahl1 * zahl1;
    }

    public static double wurzelrechnen(double zahl1) {
        return Math.sqrt(zahl1);
    }

    public static int fakRechner(double zahl) {
        zahl = (int) zahl;
        int fakzahl = 1;
        for (int i = 1; i <= zahl; i++) {
            fakzahl *= i;
        }
        return fakzahl;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
