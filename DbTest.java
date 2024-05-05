package Passautosis;

import java.io.InputStream;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.InputMap;
import javax.swing.JOptionPane;

public class DbTest {
	
	  Connection conn;
	public static void connect() {
		// TODO Auto-generated method stub
		
		Connection conn;
		String username = "root";
		String pwd = "Conara123#";
		String dbname = "passportautomationsystem";
		try {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"passportautomationsystem","root","Conara123#");
		System.out.println("Database connection sucess");
		}
		catch(SQLException e) {
		System.out.println("Database connection failed");
		System.out.println(e);
		}

	}
	public static void insertapplicantdata1(String Aname,String Address,String Username,String Apassword) {
		// TODO Auto-generated method stub
		
		// Database connection details
        String url = "jdbc:mysql://localhost:3306/passportautomationsystem";
        String username = "root";
        String password = "Conara123#";
        
     // SQL insert statement
        String sql = "INSERT INTO applicant (Aname, Address,Username,Apassword) VALUES (?, ?, ?,?)";
        
        try (Connection conn = DriverManager.getConnection(url, username, password);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
               // Set values for the prepared statement
               pstmt.setString(1, Aname);
               pstmt.setString(2, Address);
               pstmt.setString(3, Username);
               pstmt.setString(4, Apassword);
               
               // Execute the insert statement
               int rowsInserted = pstmt.executeUpdate();
               if (rowsInserted > 0) {
                   System.out.println("Data inserted successfully!");
                   JOptionPane.showMessageDialog( null, "Data inserted successfully!");
               }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            JOptionPane.showMessageDialog( null, "Data inserted unsuccessfully!");
        }
        }
	
        public static void Authenticateuser(String Username,String Apassword) {
        	
        	// TODO Auto-generated method stub
    		
    		// Database connection details
            String url = "jdbc:mysql://localhost:3306/passportautomationsystem";
            String username = "root";
            String password = "Conara123#";
            
            String a=Username;
            String b=Apassword;
           
            
            try (Connection conn = DriverManager.getConnection(url, username, password))
                     {
            	String sql="SELECT Username,Apassword FROM applicant WHERE Username = ? ;";
            	PreparedStatement stmt = conn.prepareStatement(sql);
            	stmt.setString(1,Username );
                   
            	ResultSet rs = stmt.executeQuery();
            	
            	while (rs.next()) {
            		// Retrieve data from each row
       			 
       			 String Username1 =rs.getString("Username");
       			 String Apassword1 = rs.getString("Apassword");
       			 
       			 if(a.equals(Username1)&&b.equals(Apassword1)) {
       				JOptionPane.showMessageDialog(null, "Login Successful!");
		            // You can perform further actions here after successful login
		            passportdatabase createna=new passportdatabase ();
					createna.setVisible(true);
			        
       			 }else {
       				JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
       			 }
            	}
                   
                   
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        public static void databaseinsertdataforapplicant(String nic,String surname ,String firstname ,String middlename ,
        		String Address ,String mobile ,String email ,String bankslipnumber,String firstverification,String psecondverification ,String avilabledate ,String currentstatus ) {
        		
        	// Database connection details
            String url = "jdbc:mysql://localhost:3306/passportautomationsystem";
            String username = "root";
            String password = "Conara123#";
            
         // SQL insert statement
            String sql = "INSERT INTO passportdatabase (nic, surname,firstname,middlename,Address,mobile,email,bankslipnumber,firstverification,psecondverification,avilabledate,currentstatus) VALUES (?, ?, ?,?,?,?,?,?,?,?,?,?)";
            
            try (Connection conn = DriverManager.getConnection(url, username, password);
                    PreparedStatement pstmt = conn.prepareStatement(sql)) {
                   // Set values for the prepared statement
                   pstmt.setString(1, nic);
                   pstmt.setString(2, surname);
                   pstmt.setString(3, firstname);
                   pstmt.setString(4, middlename);
                   pstmt.setString(5, Address);
                   pstmt.setString(6, mobile);
                   pstmt.setString(7, email);
                   pstmt.setString(8, bankslipnumber);
                   pstmt.setString(9, firstverification);
                   pstmt.setString(10, psecondverification);
                   pstmt.setString(11, avilabledate);
                   pstmt.setString(12, currentstatus);
                   
                   // Execute the insert statement
                   int rowsInserted = pstmt.executeUpdate();
                   if (rowsInserted > 0) {
                       System.out.println("Data inserted successfully!");
                       JOptionPane.showMessageDialog( null, "Data inserted successfully!");
                   }
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
                JOptionPane.showMessageDialog( null, "Data inserted unsuccessfully!");
            }

        }
        @SuppressWarnings("null")
		public static void Applicantsearch(String nic){
			
			 
			// Database connection details
            String url = "jdbc:mysql://localhost:3306/passportautomationsystem";
            String username = "root";
            String password = "Conara123#";
            
            // SQL query to check username and password
            
			
            try(Connection conn = DriverManager.getConnection(url, username, password))
            		{
            String sql="SELECT avilabledate ,currentstatus FROM passportdatabase WHERE nic = ?";
        
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, nic);
			
			
			
			ResultSet rs = stmt.executeQuery();
			// Process the results
			
			while (rs.next()) {
			 // Retrieve data from each row
			 
			 String avilabledate =rs.getString("avilabledate");
			 String currentstatus = rs.getString("currentstatus");
			 
			// Print or process the retrieved data
			 System.out.println("Data search suceesfully");
			System.out.println("avilabledate - " +avilabledate +"   currentstatus - "+currentstatus );
			JOptionPane.showMessageDialog(null, "Data search successful:\n"+"Avilabledate - " +avilabledate +"   currentstatus - "+currentstatus  );
			
			}}
        		catch(SQLException ex) {
      			 
      			 ex.printStackTrace();
      			  
      
        		}
	
            		
            		}  	
        public static void regionalfirstverification(String nic,String firstverification) {
        	
        	// Database connection details
            String url = "jdbc:mysql://localhost:3306/passportautomationsystem";
            String username = "root";
            String password = "Conara123#";
            
            // SQL query to check username and password
            
			
            String sql="UPDATE passportdatabase SET firstverification = ? WHERE nic = ?";
            
            
            try (Connection conn = DriverManager.getConnection(url, username, password);
                    PreparedStatement stmt = conn.prepareStatement(sql)){
            	
            	// Set parameters for the prepared statement
            	stmt.setString(1,firstverification );
            	stmt.setString(2, nic);
            	
            	
            	
				// Execute the statement
            	
				int rowsUpdated = stmt.executeUpdate();
            	
            	if (rowsUpdated > 0) {
            		 System.out.println("Data updated successfully!");
            		 JOptionPane.showMessageDialog(null, "Data updated successfully!");
            		}  
            	else {
            		System.out.println("Data update Failed!");
            		JOptionPane.showMessageDialog(null, "Data updated unsuccessfully!");
            	}

            		

            }catch (SQLException e) {
                // Handle any SQL exceptions
            	System.out.println("Data update Failed!");
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Data updated unsuccessfully!");
            	
            
        	
            }}

        public static void changeavilabledate(String nic,String availabledate) {
        	
        	// Database connection details
            String url = "jdbc:mysql://localhost:3306/passportautomationsystem";
            String username = "root";
            String password = "Conara123#";
            
            // SQL query to check username and password
            
			
            String sql="UPDATE passportdatabase SET avilabledate = ? WHERE nic = ?;";
            
            try (Connection conn = DriverManager.getConnection(url, username, password);
                    PreparedStatement stmt = conn.prepareStatement(sql)){
            	
            	// Set parameters for the prepared statement
            	stmt.setString(1,availabledate );
            	stmt.setString(2, nic);
            	
            	int rowsUpdated = stmt.executeUpdate();
            	
            	if (rowsUpdated > 0) {
            		 System.out.println("Data updated successfully!");
            		 JOptionPane.showMessageDialog(null, "Data updated successfully!");
            		}  
            	else {
            		System.out.println("Data update Failed!");
            		JOptionPane.showMessageDialog(null, "Data updated unsuccessfully!");
            	
            	}
            	}catch (SQLException e) {
                    // Handle any SQL exceptions
                	System.out.println("Data update Failed!");
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Data updated unsuccessfully!");
                	
            	
            }}
        
        public static void changeacurrentstatus(String nic,String currentstatus) {
        	
        	// Database connection details
            String url = "jdbc:mysql://localhost:3306/passportautomationsystem";
            String username = "root";
            String password = "Conara123#";
            
            // SQL query to check username and password
            
			
            String sql="UPDATE passportdatabase SET currentstatus = ? WHERE nic = ?;";
            
            try (Connection conn = DriverManager.getConnection(url, username, password);
                    PreparedStatement stmt = conn.prepareStatement(sql)){
            	
            	// Set parameters for the prepared statement
            	stmt.setString(1,currentstatus );
            	stmt.setString(2, nic);
            	
            	int rowsUpdated = stmt.executeUpdate();
            	
            	if (rowsUpdated > 0) {
            		 System.out.println("Data updated successfully!");
            		 JOptionPane.showMessageDialog(null, "Data updated successfully!");
            		}  
            	else {
            		System.out.println("Data update Failed!");
            		JOptionPane.showMessageDialog(null, "Data updated unsuccessfully!");
            	
            	}
            	}catch (SQLException e) {
                    // Handle any SQL exceptions
                	System.out.println("Data update Failed!");
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Data updated unsuccessfully!");
                	
            	
            	}}
            
        
        public static void psecondverification(String nic,String psecondverification) {
        	
        	// Database connection details
            String url = "jdbc:mysql://localhost:3306/passportautomationsystem";
            String username = "root";
            String password = "Conara123#";
            
            // SQL query to check username and password
            
			
            String sql="UPDATE passportdatabase SET psecondverification = ? WHERE nic = ?;";
            
            try (Connection conn = DriverManager.getConnection(url, username, password);
                    PreparedStatement stmt = conn.prepareStatement(sql)){
            	
            	// Set parameters for the prepared statement
            	stmt.setString(1,psecondverification );
            	stmt.setString(2, nic);
            	
            	int rowsUpdated = stmt.executeUpdate();
            	
            	if (rowsUpdated > 0) {
            		 System.out.println("Data updated successfully!");
            		 JOptionPane.showMessageDialog(null, "Data updated successfully!");
            		}  
            	else {
            		System.out.println("Data update Failed!");
            		JOptionPane.showMessageDialog(null, "Data updated unsuccessfully!");
            	
            	}
            	}catch (SQLException e) {
                    // Handle any SQL exceptions
                	System.out.println("Data update Failed!");
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Data updated unsuccessfully!");
                	
            	
            	}}
        
        public static void searchpassportdatabase(String nic){
			
			 
			// Database connection details
            String url = "jdbc:mysql://localhost:3306/passportautomationsystem";
            String username = "root";
            String password = "Conara123#";
            
            // SQL query to check username and password
            
            String sql="SELECT surname,firstname,middlename,Address,mobile,email FROM passportdatabase WHERE nic = ?";
            try(Connection conn = DriverManager.getConnection(url, username, password))
            		{
           
        
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, nic);
			
			
			
			ResultSet rs = stmt.executeQuery();
			// Process the results
			
			while (rs.next()) {
			 // Retrieve data from each row
			 
			 String surname =rs.getString("surname");
			 String firstname = rs.getString("firstname");
			 String middlename =rs.getString("middlename");
			 String Address = rs.getString("Address");
			 String mobile =rs.getString("mobile");
			 String email = rs.getString("email");
			 
			// Print or process the retrieved data
			 System.out.println("Data search suceesfully");


			JOptionPane.showMessageDialog(null, "Data search successful:\n"+"surname - " +surname +"\nfirstname - "+firstname+"\nmiddlename - "+middlename+"\nAddress - "+Address+"\nmobile - "+mobile+"\nemail - "+email  );
			
			}}
    		catch(SQLException ex) {
  			 
  			 ex.printStackTrace();
  			
    		}
            }
        
        
        

}

