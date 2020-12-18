import javax.swing.*;
import java.awt.*;

class ButtonPanel7 extends JPanel {
    JButton btnAdd = new JButton("Add New");
    JButton btnUpdate = new JButton("Update");
    JButton btnDelete = new JButton("Delete");
    JButton btnClose = new JButton("Close");



    public ButtonPanel7() {
        setLayout(new GridLayout(1, 4));
        add(btnAdd);
        add(btnUpdate);
        add(btnDelete);
        add(btnClose);

        btnUpdate.addActionListener(new Kelas7EditPanel.buttonupdate());
        btnDelete.addActionListener(new Kelas7EditPanel.buttondelete());
        btnAdd.addActionListener(new Kelas7EditPanel.buttonadd());
        btnClose.addActionListener(new Kelas7EditPanel.CloseListener());
    }
}
