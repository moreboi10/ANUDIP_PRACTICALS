import java.sql.*;

public class jdbc_connector{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Student_1";
        String user = "root";
        String password = "moreboi10";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to MySQL!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
