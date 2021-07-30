package JDBC0721;

import java.sql.*;

public class CRUDTest {

	/*
	  CRUD CREATE,READ(검색,조회),UPDATE,DELETE
	 */
DBConnection dc=new DBConnection();
	Connection con;
	Statement stmt=null;
	
	public void insert() {
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","KHS","1234");
			stmt=con.createStatement();
			
			String sql="INSERT INTO JAVASQL VALUES('자바 이름')";
			int count=stmt.executeUpdate(sql);
			
			if(count>0) {
				System.out.println("insert");
			}else {
				System.out.println("insert fail");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Insert fail");
		}
	}
}
