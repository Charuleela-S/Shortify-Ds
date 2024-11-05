import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/user_auth"; // Update with your DB URL
    private static final String USER = "CHARU"; // Your DB username
    private static final String PASSWORD = "Charu@123"; // Your DB password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
