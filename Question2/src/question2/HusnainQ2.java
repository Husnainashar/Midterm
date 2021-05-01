
package question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class HusnainQ2 {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            
            Connection conn;
            String dbURL = "jdbc:postgresql://127.0.0.1:5432/midterm";  
            String userName = "postgres";
            String password = "hamza123";
            conn = DriverManager.getConnection(dbURL, userName, password);
            String query = "select * from hamza.\"Cities\" ";  //schema.tableName
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
               System.out.println(rs.getString("city_name"));
                System.out.println(rs.getString("city_id"));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
             
        }
        
        
    }                         
    }
    