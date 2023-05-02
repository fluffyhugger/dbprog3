
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "root";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection con = DriverManager.getConnection(URL,username,password);
            System.out.println("Connection established");
            Statement statement = con.createStatement();
            String sql = "SELECT * FROM mydb3.student";
            ResultSet results = statement.executeQuery(sql);

            while(results.next()){
                System.out.println(results.getString("studentID") + " " + results.getString("firstName") + " " + results.getString("lastName") + " " + results.getString("email") + " " + results.getString("deptID"));
            }
        }catch (ClassNotFoundException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}