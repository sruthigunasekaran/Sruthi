package mulesoft;
import java.sql.*;
public class createtable {
	public static void createNewTable() {  
        String url = "jdbc:sqlite:"C:\Users\HP\Desktop\Dbconnection.java"        String sql = "CREATE TABLE IF NOT EXISTS Movies (\n"  
                + " Moviename text,\n"  
                + " Actor text,\n"  
                + " Actress text,\n"  
                + " yearofrelease integer,\n"  
                + " Director text\n"  
                + ");";  
          
        try{  
            Connection conn = DriverManager.getConnection(url);  
            Statement stmt = conn.createStatement();  
            stmt.execute(sql);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
}
