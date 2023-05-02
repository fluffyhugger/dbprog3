import java.sql.*;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class LAB13 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "root";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL,username,password);
            String sql = "update student set email = ? where studentID = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,"sirapob@gmail.com");
            preparedStatement.setString(2,"11111");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, e);
        } catch (ClassNotFoundException e) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
