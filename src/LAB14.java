import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class LAB14 {
    public static void main(String[] args) {
            String URL = "jdbc:mysql://localhost:3306/mydb3";
            String username = "root";
            String password = "root";
            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(URL,username,password);
                Statement statement = con.createStatement();
                String sql = "SELECT * FROM student";
                ResultSet set = statement.executeQuery(sql);
                ResultSetMetaData metaData = set.getMetaData();
                System.out.println();

                for (int i = 1; i < metaData.getColumnCount(); i++) {
                    System.out.printf("%-12s\t",set.getObject(i));
                    System.out.println();
                }

            }catch (ClassNotFoundException ex) {
                Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
            }
}
}