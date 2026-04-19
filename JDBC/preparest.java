import java.sql.*;
import java.util.*;

public class preparest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // to load a driver
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","student","12345");  //to establish connection
			System.out.println("Connected");
			//INSERT
			
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter id no.");
//			int id=sc.nextInt();
//			sc.nextLine();
//			
//			System.out.println("Enter name");
//			String nm=sc.nextLine();
//			
//			String query="insert into student values(?,?)";
//			PreparedStatement pst=con.prepareStatement(query);
//			pst.setInt(1, id);
//			pst.setString(2,nm);
//			pst.executeUpdate();
//			
//			pst.setInt(1, 6);
//			pst.setString(2,"Alice");
//			pst.executeUpdate();
			
			//UPDATE
//			Scanner sc=new Scanner(System.in);
//			
//			System.out.println("Enter name");
//			String nm=sc.nextLine();
//			
//			String query="update student set name=? where id=?";
//			PreparedStatement pst=con.prepareStatement(query);
//			pst.setString(1,nm);
//			pst.setInt(2,4);
//			pst.executeUpdate();
			
//			String query="update student set name=? where id=?";
//			PreparedStatement pst=con.prepareStatement(query);
//			pst.setString(1, "Arpit");
//			pst.setInt(2,4);
//			pst.executeUpdate();
			
			
			//DELETE
			
//			String query="delete student where id=?";
//			PreparedStatement pst=con.prepareStatement(query);
//			pst.setInt(1,4);
//			pst.executeUpdate();
//			
			//SELECT
			
//			String query2="select *from student";
//			PreparedStatement pst2=con.prepareStatement(query2);
//			ResultSet rs=pst2.executeQuery();
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+" "+rs.getString("name"));
//			}
			
			
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
