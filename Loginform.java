package Passautosis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Loginform extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usernametextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginform frame = new Loginform();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Loginform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel loginformlblNewLabel = new JLabel("LOGIN FORM");
		loginformlblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		loginformlblNewLabel.setBounds(243, 10, 115, 29);
		contentPane.add(loginformlblNewLabel);
		
		JLabel usernamelblNewLabel_1 = new JLabel("username");
		usernamelblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		usernamelblNewLabel_1.setBounds(51, 73, 87, 29);
		contentPane.add(usernamelblNewLabel_1);
		
		JLabel passwordlblNewLabel_2 = new JLabel("Password");
		passwordlblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		passwordlblNewLabel_2.setBounds(51, 130, 75, 29);
		contentPane.add(passwordlblNewLabel_2);
		
		usernametextField = new JTextField();
		usernametextField.setFont(new Font("Arial", Font.PLAIN, 14));
		usernametextField.setBounds(192, 78, 395, 19);
		contentPane.add(usernametextField);
		usernametextField.setColumns(10);
		
		JButton loginbtnNewButton = new JButton("LOGIN");
		loginbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DbTest.connect();
				String Username = usernametextField.getText();
		        String Apassword=passwordField.getText();
		        
		        
		        
		         
		        DbTest.Authenticateuser(Username, Apassword);	
		        
		        usernametextField.setText("");
				passwordField.setText("");
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
			
			
			
			
		});
		loginbtnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		loginbtnNewButton.setBounds(80, 216, 113, 35);
		contentPane.add(loginbtnNewButton);
		
		JButton CreatenewcaccountbtnNewButton_1 = new JButton("CREATE NEW ACCOUNT");
		CreatenewcaccountbtnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Createnewaccount createna=new Createnewaccount ();
				createna.setVisible(true);
		        this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		CreatenewcaccountbtnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		CreatenewcaccountbtnNewButton_1.setBounds(368, 216, 207, 35);
		contentPane.add(CreatenewcaccountbtnNewButton_1);
		
		JButton showcurrentstatusbtnNewButton_2 = new JButton("SHOW CURRENT STATUS");
		showcurrentstatusbtnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentstatus createna=new currentstatus ();
				createna.setVisible(true);
		        this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		showcurrentstatusbtnNewButton_2.setFont(new Font("Arial", Font.BOLD, 14));
		showcurrentstatusbtnNewButton_2.setBounds(364, 277, 223, 29);
		contentPane.add(showcurrentstatusbtnNewButton_2);
		
		JButton resetbtnNewButton = new JButton("CLEAR");
		resetbtnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		resetbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usernametextField.setText("");
				passwordField.setText("");
				
			}
		});
		resetbtnNewButton.setBounds(80, 274, 113, 34);
		contentPane.add(resetbtnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(192, 136, 395, 19);
		contentPane.add(passwordField);
		}
}
