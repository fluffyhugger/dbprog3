import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class LAB12 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "root";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL,username,password);
            String sql = "insert into student(studentID,firstName,lastName,email,deptID)" +
                    "values('?','?','?','?')";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,"111111");
            preparedStatement.setString(2,"Sparrow");
            preparedStatement.setString(3,"Jack");
            preparedStatement.setString(4,"Jack.Spa@gmail.com");
            preparedStatement.setString(5,"CS");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, e);
        } catch (ClassNotFoundException e) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
