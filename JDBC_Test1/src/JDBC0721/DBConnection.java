package JDBC0721;

import java.sql.*;


public class DBConnection {

	public static Connection DBConnect() {
		//DB접속정보 저장
		Connection con= null;
	
		//접속할 DB의 계정정보
		String user="KHS";
		String password="1234";
		
		//접속할 DB의 주소
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
	
		try {
			
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,user,password);
			System.out.println("DB접속 성공");
			
		}catch(ClassNotFoundException cne) {
			//forname실패시
			System.out.println("DB접속 실패>드라이버 로딩 실패");
			cne.printStackTrace();
		}catch(SQLException se) {
			//dirvermaneger실패시
			System.out.println("DB계정 주소 확인");
			se.printStackTrace();
		}
		
		
		
		return con;		
	}
	

}
