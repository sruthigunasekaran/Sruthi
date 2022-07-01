package mulesoft;
import java.sql.*;
public class select {
	 public static void selectAll(){  
	        String sql = "SELECT * FROM Movies"; 
	        System.out.println("Select All query");
	          
	        try {  
	            Connection conn =Dbconnection.connect();  
	            Statement stmt  = conn.createStatement();  
	            ResultSet rs    = stmt.executeQuery(sql);  
	            while (rs.next()) {  
	                System.out.println(rs.getString("Moviename") +  "\t" +   
	                                   rs.getString("Actor") + "\t" +  
	                                   rs.getString("Actress") + "\t" +
	                                   rs.getString("Director") + "\t" +  
	                                   rs.getInt("yearofrelease"));  
	            }  
	        } catch (SQLException e) {  
	            System.out.println(e.getMessage());  
	        }  
	    }  
	 public static void selectactormovie(){
		 	System.out.println("Select MOVIENAME By Actor Vijay Devarakonda");
	        String sql = "SELECT Moviename FROM Movies WHERE Actor LIKE'%Vijay Devarakonda%'"; 
	          
	        try {  
	            Connection conn =Dbconnection.connect();  
	            Statement stmt  = conn.createStatement();  
	            ResultSet rs    = stmt.executeQuery(sql);  
	            while (rs.next()) {  
	                System.out.println(rs.getString("Moviename"));  
	            }  
	        } catch (SQLException e) {  
	            System.out.println(e.getMessage());  
	        }  
	    }
}
