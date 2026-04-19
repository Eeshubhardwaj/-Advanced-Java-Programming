import java.sql.*;

public class Batch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); // to load a driver
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","student","12345");  //to establish connection
			System.out.println("Connected");
			
			Statement s=con.createStatement();
			
			s.addBatch("INSERT INTO STUDENT VALUES(19,'RIYA')");
			s.addBatch("INSERT INTO STUDENT VALUES(16,'Alex')");
			s.addBatch("Update student set name='Sameer' where id=2");
			s.executeBatch();
			
			
			
			con.close();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}

	}

}
