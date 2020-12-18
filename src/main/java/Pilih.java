import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Pilih extends JFrame{
    private JButton btn1 = new JButton("Kelas 7");
    private JButton btn2 = new JButton("Kelas 8");
    private JButton btn3 = new JButton("Kelas 9");

    public Pilih() {
        setTitle("Pilihan Kelas");
        setSize(550, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(null);

        JLabel labelWelcome = new JLabel("Welcome !!!");
        labelWelcome.setBounds(80, 10, 100, 35);
        panel.add(labelWelcome);

        JLabel labelIntro = new JLabel("Please Choose a Class");
        labelIntro.setBounds(80,25,200,35);
        panel.add(labelIntro);

        btn1.setBounds(80, 60, 150, 50);
        btn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(btn1);

        btn2.setBounds(80, 120, 150, 50);
        btn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(btn2);

        btn3.setBounds(80, 180, 150, 50);
        btn3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(btn3);


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Kelas7();
                dispose();
            }

        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Kelas8();
                dispose();
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Kelas9();
                dispose();
            }
        });

        setVisible(true);


    }
}
