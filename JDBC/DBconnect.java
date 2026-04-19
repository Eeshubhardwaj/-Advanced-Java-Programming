import java.sql.*;
import java.util.*;

public class DBconnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // to load a driver
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","student","12345");  //to establish connection
			System.out.println("Connected");
			
			Statement st=con.createStatement();
			
			String query="INSERT INTO student(id,name)VALUES(9,'Max')";
			st.addBatch(query);
			//st.executeUpdate(query);
			
			String query1="INSERT INTO student VALUES(10,'Ayush')";
			st.addBatch(query1);
//			st.executeUpdate(query1);
			
			System.out.println("Data inserted");
			
			
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter name for id=2");
//			String nm=sc.nextLine();
//			
//			String query2="Update student set name='" +nm+ "' where id=2";
//			st.executeUpdate(query2);
//			
			String query2="Update student set name='Sameer' where id=2";
			String query3="delete student where id=3";
			st.addBatch(query2);
			st.addBatch(query3);
			
			
//			int n=st.executeUpdate(query3);
//			System.out.println(n+" rows affected");
			
						
//			String query="select * from student";
//			
//			ResultSet rs=st.executeQuery(query);
//			
//			while(rs.next()) {
//				int id=rs.getInt("id");
//				String name=rs.getString(2);
//				System.out.println(id +" "+ name);
//			}
			
			
			
			
			
			con.close();
			st.close();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
