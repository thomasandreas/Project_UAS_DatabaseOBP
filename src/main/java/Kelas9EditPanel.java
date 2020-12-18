

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Kelas9EditPanel extends JPanel {
    static JTextField ID = new JTextField();
    static JTextField FirstName = new JTextField();
    static JTextField LastName = new JTextField();
    static JTextField NilaiIPA = new JTextField();
    static JTextField NilaiTOIPA = new JTextField();
    static JTextField NilaiIPS= new JTextField();
    static JTextField NilaiTOIPS= new JTextField();
    static JTextField NilaiBhsIndo = new JTextField();
    static JTextField NilaiTOBhsIndo = new JTextField();
    static JTextField NilaiBhsIng = new JTextField();
    static JTextField NilaiTOBhsIng = new JTextField();
    static JTextField NilaiMat = new JTextField();
    static JTextField NilaiTOMat = new JTextField();
    public Kelas9EditPanel() {
        setLayout(new GridLayout(5, 2));

        add(new JLabel("ID"));
        add(ID);

        add(new JLabel("First name"));
        add(FirstName);

        add(new JLabel("Last Name"));
        add(LastName);

        add(new JLabel("IPA"));
        add(NilaiIPA);

        add(new JLabel("TO IPA"));
        add(NilaiTOIPA);

        add(new JLabel("IPS"));
        add(NilaiIPS);

        add(new JLabel("TO IPS"));
        add(NilaiTOIPS);

        add(new JLabel("Bahasa Indonesia"));
        add(NilaiBhsIndo);

        add(new JLabel("TO Bahasa Indonesia"));
        add(NilaiTOBhsIndo);

        add(new JLabel("Bahasa Inggris"));
        add(NilaiBhsIng);

        add(new JLabel("TO Bahasa Inggris"));
        add(NilaiTOBhsIng);

        add(new JLabel("Matematika"));
        add(NilaiMat);

        add(new JLabel("TO Matematika"));
        add(NilaiTOMat);


        //border
        Border etchedBorder = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

        TitledBorder titledBorder = BorderFactory.createTitledBorder(etchedBorder, "Student Record Editor");
        titledBorder.setTitleFont(titledBorder.getTitleFont().deriveFont(Font.BOLD));

        setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10, 10), titledBorder));
    }

    static class buttonupdate implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String sql = "UPDATE data_siswa_kelas9 SET First_name=?,last_name=?,nilai_ipa=?,nilai_to_ipa=?,nilai_ips=?,nilai_to_ips=?,nilai_bhsind=?,nilai_to_bhsind=?,nilai_bhsing=?,nilai_to_bhsing=?,nilai_mat=?,nilai_to_mat=?,nilai_rata = (SELECT((nilai_ipa + nilai_ips + nilai_bhsind + nilai_bhsing + nilai_mat)/5)), nilai_rata_to=(SELECT ((nilai_to_ipa + nilai_to_ips + nilai_to_bhsind + nilai_to_bhsing + nilai_to_mat)/5)) WHERE id_siswa=?";
                Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Kelas_Java","root","");

                PreparedStatement ps=conn.prepareStatement(sql);

                ps.setString(1,FirstName.getText());
                ps.setString(2,LastName.getText());
                ps.setString(3,NilaiIPA.getText());
                ps.setString(4,NilaiTOIPA.getText());
                ps.setString(5,NilaiIPS.getText());
                ps.setString(6,NilaiTOIPS.getText());
                ps.setString(7,NilaiBhsIndo.getText());
                ps.setString(8,NilaiTOBhsIndo.getText());
                ps.setString(9,NilaiBhsIng.getText());
                ps.setString(10,NilaiTOBhsIng.getText());
                ps.setString(11,NilaiMat.getText());
                ps.setString(12,NilaiTOMat.getText());
                ps.setString(13,ID.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data berhasil diupdate");
                emptyForm();
                DataPanel9.ambilData();


            } catch (Exception exception) {
                exception.printStackTrace();
            }

        }
        private void emptyForm(){
            ID.setText("");

        }

    }

    static class buttondelete implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String sql = "DELETE FROM data_siswa_kelas9 WHERE id_siswa=?";
                Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Kelas_Java","root","");

                PreparedStatement ps=conn.prepareStatement(sql);


                ps.setString(1,ID.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data berhasil didelete");
                emptyForm();
                DataPanel9.ambilData();


            } catch (Exception exception) {
                exception.printStackTrace();
            }

        }
        private void emptyForm(){
            ID.setText("");

        }

    }

    static class buttonadd implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String sql = "INSERT INTO data_siswa_kelas9  (id_siswa,First_name,last_name,nilai_ipa,nilai_to_ipa,nilai_ips,nilai_to_ips,nilai_bhsind,nilai_to_bhsind,nilai_bhsing,nilai_to_bhsing,nilai_mat,nilai_to_mat) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Kelas_Java","root","");

                PreparedStatement ps=conn.prepareStatement(sql);
                ps.setString(1,ID.getText());
                ps.setString(2,FirstName.getText());
                ps.setString(3,LastName.getText());
                ps.setString(4,NilaiIPA.getText());
                ps.setString(5,NilaiTOIPA.getText());
                ps.setString(6,NilaiIPS.getText());
                ps.setString(7,NilaiTOIPS.getText());
                ps.setString(8,NilaiBhsIndo.getText());
                ps.setString(9,NilaiTOBhsIndo.getText());
                ps.setString(10,NilaiBhsIng.getText());
                ps.setString(11,NilaiTOBhsIng.getText());
                ps.setString(12,NilaiMat.getText());
                ps.setString(13,NilaiTOMat.getText());

                ps.executeUpdate();

                String sql2="UPDATE data_siswa_kelas9 SET nilai_rata = (SELECT((nilai_ipa + nilai_ips + nilai_bhsind + nilai_bhsing + nilai_mat)/5)), nilai_rata_to=(SELECT ((nilai_to_ipa + nilai_to_ips + nilai_to_bhsind + nilai_to_bhsing + nilai_to_mat)/5)) WHERE id_siswa=?";
                PreparedStatement ps2=conn.prepareStatement(sql2);
                ps2.setString(1,ID.getText());
                ps2.executeUpdate();

                JOptionPane.showMessageDialog(null,"Data berhasil ditambah");
                emptyForm();
                DataPanel9.ambilData();


            } catch (Exception exception) {
                exception.printStackTrace();
            }

        }
        private void emptyForm(){
            ID.setText("");

        }

    }

    static class CloseListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //DO SOMETHING
         System.exit(0);


        }
    }

}
