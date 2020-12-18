import javax.swing.*;


public class Kelas9 extends JFrame {
    public Kelas9() {
        setTitle("Kelas 9");
        setSize(1080,420);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new DataPanel9());
        add(new Kelas9EditPanel());
        add(new ButtonPanel9());

        setVisible(true);
    }
}