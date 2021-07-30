package JDBC0721;

public class CRUDMain {

	public static void main(String[] args) {
		CRUDTest ct=new CRUDTest();
		DBConnection dc= new DBConnection();
		
		dc.DBConnect();
		ct.insert();
		
	}

}
