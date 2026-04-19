import java.sql.*;

public class conn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Connection  con=null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); // to load a driver
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","student","12345");  //to establish connection
			System.out.println("Connected");
			
			con.setAutoCommit(false);
			Statement st=con.createStatement();
			st.executeUpdate("insert into student values(17,'Shivam')");
			
			con.commit();
			
			
			
		}catch(Exception e){
			
			try{;
			con.rollback();
			
		}catch(SQLException e1) {
			e1.printStackTrace();
		 }
		}

}
}


