import javax.swing.*;
import java.awt.*;

class ButtonPanel8 extends JPanel {
    JButton btnAdd = new JButton("Add New");
    JButton btnUpdate = new JButton("Update");
    JButton btnDelete = new JButton("Delete");
    JButton btnClose = new JButton("Close");



    public ButtonPanel8() {
        setLayout(new GridLayout(1, 4));
        add(btnAdd);
        add(btnUpdate);
        add(btnDelete);
        add(btnClose);

        btnUpdate.addActionListener(new Kelas8EditPanel.buttonupdate());
        btnDelete.addActionListener(new Kelas8EditPanel.buttondelete());
        btnAdd.addActionListener(new Kelas8EditPanel.buttonadd());
        btnClose.addActionListener(new Kelas8EditPanel.CloseListener());
    }
}
