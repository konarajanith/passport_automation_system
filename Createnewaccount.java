package Passautosis;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Createnewaccount extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField enteryournametextField;
	private JTextField enteryouraddresstextField_1;
	private JTextField usernametextField_2;
	private JTextField passwordtextField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Createnewaccount frame = new Createnewaccount();
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
	public Createnewaccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel createnewaccountlblNewLabel = new JLabel("CREATE NEW ACCOUNT");
		createnewaccountlblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		createnewaccountlblNewLabel.setBounds(110, 34, 228, 13);
		contentPane.add(createnewaccountlblNewLabel);
		
		JLabel EnteryournamelblNewLabel = new JLabel("ENTER YOUR NAME");
		EnteryournamelblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		EnteryournamelblNewLabel.setBounds(27, 65, 148, 13);
		contentPane.add(EnteryournamelblNewLabel);
		
		JLabel EnteryouraddresslblNewLabel_1 = new JLabel("ENTER YOUR ADDRESS");
		EnteryouraddresslblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		EnteryouraddresslblNewLabel_1.setBounds(27, 107, 170, 13);
		contentPane.add(EnteryouraddresslblNewLabel_1);
		
		JLabel enterusernamelblNewLabel_2 = new JLabel("ENTER YOUR USERNAME");
		enterusernamelblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		enterusernamelblNewLabel_2.setBounds(27, 148, 187, 13);
		contentPane.add(enterusernamelblNewLabel_2);
		
		JLabel EnterpasswordlblNewLabel_3 = new JLabel("ENTER PASSWORD");
		EnterpasswordlblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 14));
		EnterpasswordlblNewLabel_3.setBounds(27, 188, 170, 13);
		contentPane.add(EnterpasswordlblNewLabel_3);
		
		enteryournametextField = new JTextField();
		enteryournametextField.setFont(new Font("Arial", Font.PLAIN, 14));
		enteryournametextField.setBounds(224, 63, 274, 19);
		contentPane.add(enteryournametextField);
		enteryournametextField.setColumns(10);
		
		enteryouraddresstextField_1 = new JTextField();
		enteryouraddresstextField_1.setFont(new Font("Arial", Font.PLAIN, 14));
		enteryouraddresstextField_1.setBounds(224, 105, 274, 19);
		contentPane.add(enteryouraddresstextField_1);
		enteryouraddresstextField_1.setColumns(10);
		
		usernametextField_2 = new JTextField();
		usernametextField_2.setFont(new Font("Arial", Font.PLAIN, 14));
		usernametextField_2.setBounds(224, 146, 274, 19);
		contentPane.add(usernametextField_2);
		usernametextField_2.setColumns(10);
		
		passwordtextField_3 = new JTextField();
		passwordtextField_3.setFont(new Font("Arial", Font.PLAIN, 14));
		passwordtextField_3.setBounds(225, 186, 273, 19);
		contentPane.add(passwordtextField_3);
		passwordtextField_3.setColumns(10);
		
		JButton resetbtnNewButton = new JButton("CLEAR");
		resetbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 enteryournametextField.setText("");
				 enteryouraddresstextField_1.setText("");
				 usernametextField_2.setText("");
				 passwordtextField_3.setText("");
			}
		});
		resetbtnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		resetbtnNewButton.setBounds(70, 257, 105, 21);
		contentPane.add(resetbtnNewButton);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 	
				DbTest.connect();
				 
				
				String Aname=enteryournametextField.getText();
				String Address=enteryouraddresstextField_1.getText();
				String Username=usernametextField_2.getText();
				String Apassword=passwordtextField_3.getText();
				
				DbTest.insertapplicantdata1(Aname, Address, Username, Apassword);
				
				// Clear text fields after insertion
				enteryournametextField.setText("");
				enteryouraddresstextField_1.setText("");
				usernametextField_2.setText("");
				passwordtextField_3.setText("");
				
				
			}	
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(253, 258, 115, 21);
		contentPane.add(btnNewButton);
		
		JButton LOGINPAGEbtnNewButton_1 = new JButton("LOGIN PAGE");
		LOGINPAGEbtnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loginform createna=new Loginform ();
				createna.setVisible(true);
		        this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		LOGINPAGEbtnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		LOGINPAGEbtnNewButton_1.setBounds(172, 297, 127, 21);
		contentPane.add(LOGINPAGEbtnNewButton_1);
	}
}
