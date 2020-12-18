import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login extends JFrame  {
    private Connection db;
    Statement stmt;

    public Login() throws ClassNotFoundException, SQLException{
        //konek database

        db = DriverManager.getConnection("jdbc:mysql://localhost:3306/kelas_java", "root", "");
        stmt = db.createStatement();

        JPanel panel = new JPanel();
        setTitle("Login Form");
        setSize(550,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(panel);

        panel.setLayout(null);

        JLabel labelLogin = new JLabel("Login");
        labelLogin.setBounds(80, 10, 100, 35);
        panel.add(labelLogin);

        JLabel labelUser = new JLabel("Username");
        labelUser.setBounds(80, 60, 80, 25);
        panel.add(labelUser);

        JTextField userText = new JTextField(35);
        userText.setBounds(180,60,220,25);
        panel.add(userText);

        JLabel labelPass = new JLabel("Password");
        labelPass.setBounds(80, 100, 80, 25);
        panel.add(labelPass);

        JPasswordField passText = new JPasswordField();
        passText.setBounds(180, 100,220,25);
        panel.add(passText);

        JButton button = new JButton("Login");
        button.setBounds(318,130,80,25);
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)  {
                try {
                    String sql = "SELECT * FROM login WHERE username='" + userText.getText() + "' AND password='" + passText.getText() + "'";
                    ResultSet rs = stmt.executeQuery(sql);
                    if (rs.next()) {
                        if (userText.getText().equals(rs.getString("username")) && passText.getText().equals(rs.getString("password"))) {
                            //JOptionPane.showMessageDialog(null, "berhasil login");
                            new Pilih();
                            dispose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "username atau password salah");
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        setVisible(true);
    }
    public boolean isConnected() {
        return (db != null);
    }
}
