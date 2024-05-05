package Passautosis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertapplicantdata {

	public static void insertapplicantdata1(String Aname,String Address,String Username,String Apassword) {
		// TODO Auto-generated method stub
		
		// Database connection details
        String url = "jdbc:mysql://localhost:3306/passportautomationsystem";
        String username = "root";
        String password = "Conara123#";
        
     // SQL insert statement
        String sql = "INSERT INTO applicant (Aname, Address,Username,Apassword) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(url, username,password);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
               // Set values for the prepared statement
               pstmt.setString(1,Aname);
               pstmt.setString(2,Address);
               pstmt.setString(3,Username);
               pstmt.setString(4,Apassword);
               
               // Execute the insert statement
               int rowsInserted = pstmt.executeUpdate();
               if (rowsInserted > 0) {
                   System.out.println("Data inserted successfully!");
               }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

	}

}
