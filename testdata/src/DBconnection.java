import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private static final String HOST = "jdbc:mysql://localhost/school?autoReconnect=true&useSSL=false";
    private static final String USER = "tsunami";
    private static final String PASS = "pikopiko";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(HOST, USER, PASS);
    }
}
