//import java.sql.*;
//
//public class sampletest {
//
//
//
//    public static void main(String[] args) throws SQLException {
//
////        Class.forName(com.mysql.jdbc.Driver);
//
//
//        try(Connection connection = DBconnection.getConnection();
//            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            ResultSet rs = statement.executeQuery("select * from students");
//            ) {
//
//            Students.getStudents(rs);
//
//            //==========================================
////            rs.first();
////            System.out.println(rs.getString(2));
////            rs.last();
////            System.out.println(rs.getString(2));
////            rs.absolute(3);
////            System.out.println(rs.getString(2));
//            //good example for explain rs.last & rs.first cursor
//            //==========================================
////            System.out.println("is connect!");
////            System.out.println(rs.getRow());
//        } catch (SQLException e){
//            System.err.print(e);
//        }
//    }
//}
