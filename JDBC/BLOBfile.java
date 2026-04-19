import java.sql.*;
import java.sql.DriverManager;
import java.io.*;

public class BLOBfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver"); // to load a driver
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","student","12345");  //to establish connection
			System.out.println("Connected");
			
//			PreparedStatement pst=con.prepareStatement("insert into file13 values(?,?,?,?)");
//			pst.setInt(1, 1);
//			pst.setString(2,"IMAGE");
//			
//			FileInputStream fis=new FileInputStream("D:\\about-banner.png");
//			pst.setBlob(3,fis);
//			
//			
//			FileReader fr=new FileReader("D:\\new.txt");
//			pst.setClob(4, fr);
//			
//			pst.executeUpdate();
			
			//retrieve
			
//			PreparedStatement ps=con.prepareStatement("select binarydata from file13");
//			ResultSet rs=ps.executeQuery();
//			if(rs.next()) {
//				Blob b=rs.getBlob(1);
//				byte[] data=b.getBytes(1,(int)b.length());
//				
//				FileOutputStream fos=new FileOutputStream("d:\\burger.png");
//				fos.write(data);
//				fos.close();
//				
//				
//			}
			
			PreparedStatement ps=con.prepareStatement("select text from file13 where id=1");
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				Clob b=rs.getClob(1);
				Reader r=b.getCharacterStream();
				
				FileWriter fw=new FileWriter("d:\\Notepad file.txt");
				int i;
				while((i=r.read())!=-1) {
					fw.write(i);
				}
				
				fw.close();
			}
			
			
			
			con.close();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}

	}

}
