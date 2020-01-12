import java.sql.*;

public class Find_max {

    private static final String SQL = "select * from students where fee <= ?";

    public static void main(String[] args) throws SQLException {

        double maxfee = 0;

        try{
            maxfee = Input.getInt(SQL);
        } catch (Exception e){
            System.err.println(e);
        }

        ResultSet rs = null;

        try {
            Connection connection = DBconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            statement.setDouble(1, maxfee);// тут 1 для замены на ? в переменной SQL
            // а точнее единица служит указателем какой менно ? мы будем заменять вторым аргументом

            rs = statement.executeQuery();
            Students.getStudents(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null){ rs.close();}
        }

    }
}
