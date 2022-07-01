package mulesoft;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
public static void main(String [] args) {
	createtable.createNewTable();
	insert("CCV","Aravind swamy ","Jyothika",2018,"Mani Ratnam");
	insert("Kullanari koottam","Vishnu vishal","Ramya Nambeesan",2011,"Sribalaji");
	insert("Meesaya Murukku","Hiphop Adhi","Aathmika",2017,"Hiphop Adhi");
	insert("Geetha Govindam","Vijay Devarakonda","Rashmika Mandanna",2018,"Parasuram");
	insert("Bengalore Days","Fahadh","Nazriya Nazim  ",2014,"Anjali Menon");
	select.selectAll();
	select.selectactormovie();
}
private static void insert(String moviename,String leadactor,String actress,Integer yearofrelease,String director) {
	Connection con=Dbconnection.connect();
	PreparedStatement ps=null;
	try {
		String sql="INSERT INTO movies(moviename,leadactor,actress,yearofrelease,director) VALUES(?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, Moviename);
		ps.setString(2, Actor);
		ps.setString(3, Actress);
		ps.setInt(4,yearofrelease);
		ps.setString(5, Director);
		ps.execute();
		System.out.println("Data has been inserted");
	}catch(SQLException e) {
		System.out.println(e.toString());
	}
}
}
