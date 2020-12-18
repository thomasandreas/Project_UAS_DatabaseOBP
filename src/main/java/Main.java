import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Login masuk = new Login();
            System.out.println("Database is connected: " + masuk.isConnected());
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
