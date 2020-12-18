import javax.print.DocFlavor;
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

class Kelas7EditPanel extends JPanel {
    static JTextField ID = new JTextField();
    static JTextField FirstName = new JTextField();
    static JTextField LastName = new JTextField();
    static JTextField NilaiIPA = new JTextField();
    static JTextField NilaiIPS= new JTextField();
    static JTextField NilaiBhsIndo = new JTextField();
    static JTextField NilaiBhsIng = new JTextField();
    static JTextField NilaiMat = new JTextField();
    public Kelas7EditPanel() {
        setLayout(new GridLayout(5, 2));

        add(new JLabel("ID"));
        add(ID);

        add(new JLabel("First name"));
        add(FirstName);

        add(new JLabel("Last Name"));
        add(LastName);

        add(new JLabel("IPA"));
        add(NilaiIPA);

        add(new JLabel("IPS"));
        add(NilaiIPS);

        add(new JLabel("Bahasa Infonesia"));
        add(NilaiBhsIndo);

        add(new JLabel("Bahasa Inggris"));
        add(NilaiBhsIng);

        add(new JLabel("Matematika"));
        add(NilaiMat);

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
                String sql = "UPDATE data_siswa_kelas7 SET First_name=?,last_name=?,nilai_ipa=?,nilai_ips=?,nilai_bhsind=?,nilai_bhsing=?,nilai_mat=?, nilai_rata = (SELECT((nilai_ipa + nilai_ips + nilai_bhsind + nilai_bhsing + nilai_mat)/5)) WHERE id_siswa=?";
                Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Kelas_Java","root","");

                PreparedStatement ps=conn.prepareStatement(sql);

                ps.setString(1,FirstName.getText());
                ps.setString(2,LastName.getText());
                ps.setString(3,NilaiIPA.getText());
                ps.setString(4,NilaiIPS.getText());
                ps.setString(5,NilaiBhsIndo.getText());
                ps.setString(6,NilaiBhsIng.getText());
                ps.setString(7,NilaiMat.getText());
                ps.setString(8,ID.getText());
                ps.executeUpdate();




                JOptionPane.showMessageDialog(null,"Data berhasil diupdate");
                emptyForm();
                DataPanel7.ambilData();


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
                String sql = "DELETE FROM data_siswa_kelas7 WHERE id_siswa=?";
                Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Kelas_Java","root","");

                PreparedStatement ps=conn.prepareStatement(sql);


                ps.setString(1,ID.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data berhasil didelete");
                emptyForm();
                DataPanel7.ambilData();


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
                String sql = "INSERT INTO data_siswa_kelas7  (id_siswa,First_name,last_name,nilai_ipa,nilai_ips,nilai_bhsind,nilai_bhsing,nilai_mat) VALUES (?,?,?,?,?,?,?,?)";
                Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Kelas_Java","root","");

                PreparedStatement ps=conn.prepareStatement(sql);
                ps.setString(1,ID.getText());
                ps.setString(2,FirstName.getText());
                ps.setString(3,LastName.getText());
                ps.setString(4,NilaiIPA.getText());
                ps.setString(5,NilaiIPS.getText());
                ps.setString(6,NilaiBhsIndo.getText());
                ps.setString(7,NilaiBhsIng.getText());
                ps.setString(8,NilaiMat.getText());
                ps.executeUpdate();

                String sql2="UPDATE data_siswa_kelas7 SET nilai_rata = (SELECT((nilai_ipa + nilai_ips + nilai_bhsind + nilai_bhsing + nilai_mat)/5)) WHERE id_siswa=?";
                PreparedStatement ps2=conn.prepareStatement(sql2);
                ps2.setString(1,ID.getText());
                ps2.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data berhasil ditambah");
                emptyForm();
                DataPanel7.ambilData();


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
