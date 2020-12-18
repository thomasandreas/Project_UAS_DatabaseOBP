import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


    class DataPanel7 extends JPanel {
        static DefaultTableModel datatable;
        static   JTable table;


        static void ambilData(){
            try{
                datatable= new DefaultTableModel();
                datatable.addColumn("ID Siswa");
                datatable.addColumn("First Name");
                datatable.addColumn("Last Name");
                datatable.addColumn("Nilai IPA");
                datatable.addColumn("Nilai IPS");
                datatable.addColumn("NIlai Bahasa Indonesia");
                datatable.addColumn("Nilai Bahasa Inggris");
                datatable.addColumn("Nilai Matematika");
                datatable.addColumn("Nilai Rata");
                PreparedStatement ps = DriverManager.getConnection("jdbc:mysql://localhost:3306/Kelas_Java","root","").prepareStatement("SELECT * FROM data_siswa_kelas7 ORDER BY Id_siswa");
                ResultSet rs = ps.executeQuery();

                while (rs.next()){
                    datatable.addRow(
                            new Object[]{
                                    rs.getString(1),
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getString(4),
                                    rs.getString(5),
                                    rs.getString(6),
                                    rs.getString(7),
                                    rs.getString(8),
                                    rs.getString(9)
                            }
                    );
                }
                table.setModel(datatable);
            }

            catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    DataPanel7() {
        datatable = new DefaultTableModel();
        table = new JTable(datatable);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        table.setEnabled(false);
        this.ambilData();

        setLayout(new GridLayout(1, 1));
        setBorder(new EmptyBorder(10, 10, 0, 10));

        add(scrollPane);
    }


}

