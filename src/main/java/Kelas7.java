import javax.swing.*;


public class Kelas7 extends JFrame {
    public Kelas7() {
        setTitle("Kelas 7");
        setSize(1080,420);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new DataPanel7());
        add(new Kelas7EditPanel());
        add(new ButtonPanel7());

        setVisible(true);
    }
}

