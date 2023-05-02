
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class LAB9 {

    public static void main(String[] args) {

        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "root";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL,username,password);
            Statement statement = con.createStatement();
            String sql = "insert into student(studentID,firstName,lastName,email,deptID)" +
                    "values('651115','Sirapob','Wuth','Sirapob.Wuth@gmail.com','IT')";
            statement.executeUpdate(sql);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
