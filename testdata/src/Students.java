import java.sql.ResultSet;
import java.sql.SQLException;

public class Students {
    public static void getStudents(ResultSet rs) throws SQLException {
        while(rs.next()){
            int id = rs.getInt("id");
            int fee = rs.getInt("fee");
            String fName = rs.getString(2);
            String lName = rs.getString(3);

            System.out.println("id - " + id);
            System.out.println("fee - " + fee);
            System.out.println("first name - " + fName);
            System.out.println("last name - " + lName);

            System.out.println("====================");
        }
    }
}
