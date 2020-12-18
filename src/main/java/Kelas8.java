import javax.swing.*;


public class Kelas8 extends JFrame {
    public Kelas8() {
        setTitle("Kelas 8");
        setSize(1080,420);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new DataPanel8());
        add(new Kelas8EditPanel());
        add(new ButtonPanel8());

        setVisible(true);
    }
}