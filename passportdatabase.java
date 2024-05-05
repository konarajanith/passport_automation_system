package Passautosis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class passportdatabase extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nictextField;
	private JTextField surnametextField_1;
	private JTextField firstnametextField_2;
	private JTextField middlenametextField_3;
	private JTextField ADDresstextField_4;
	private JTextField mobiletextField_5;
	private JTextField emailtextField_6;
	private JTextField banktextField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					passportdatabase frame = new passportdatabase();
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
	public passportdatabase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 535);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PASSPORT DATABASE");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(223, 10, 173, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NIC");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 34, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SURNAME");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 73, 73, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("FIRST NAME");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 110, 99, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("MIDDLE NAME");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 149, 117, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ADDRESS");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 185, 99, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("MOBILE");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 222, 73, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("EMAIL");
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_7.setBounds(10, 264, 45, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("BANK SLIP NUMBER");
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_8.setBounds(10, 299, 164, 13);
		contentPane.add(lblNewLabel_8);
		
		nictextField = new JTextField();
		nictextField.setFont(new Font("Arial", Font.PLAIN, 14));
		nictextField.setBounds(173, 33, 440, 19);
		contentPane.add(nictextField);
		nictextField.setColumns(10);
		
		surnametextField_1 = new JTextField();
		surnametextField_1.setFont(new Font("Arial", Font.PLAIN, 14));
		surnametextField_1.setBounds(173, 71, 440, 19);
		contentPane.add(surnametextField_1);
		surnametextField_1.setColumns(10);
		
		firstnametextField_2 = new JTextField();
		firstnametextField_2.setFont(new Font("Arial", Font.PLAIN, 14));
		firstnametextField_2.setBounds(173, 108, 440, 19);
		contentPane.add(firstnametextField_2);
		firstnametextField_2.setColumns(10);
		
		middlenametextField_3 = new JTextField();
		middlenametextField_3.setFont(new Font("Arial", Font.PLAIN, 14));
		middlenametextField_3.setBounds(173, 147, 440, 19);
		contentPane.add(middlenametextField_3);
		middlenametextField_3.setColumns(10);
		
		ADDresstextField_4 = new JTextField();
		ADDresstextField_4.setFont(new Font("Arial", Font.PLAIN, 14));
		ADDresstextField_4.setBounds(173, 183, 440, 19);
		contentPane.add(ADDresstextField_4);
		ADDresstextField_4.setColumns(10);
		
		mobiletextField_5 = new JTextField();
		mobiletextField_5.setFont(new Font("Arial", Font.PLAIN, 14));
		mobiletextField_5.setBounds(173, 220, 440, 19);
		contentPane.add(mobiletextField_5);
		mobiletextField_5.setColumns(10);
		
		emailtextField_6 = new JTextField();
		emailtextField_6.setFont(new Font("Arial", Font.PLAIN, 14));
		emailtextField_6.setBounds(173, 262, 440, 19);
		contentPane.add(emailtextField_6);
		emailtextField_6.setColumns(10);
		
		banktextField_7 = new JTextField();
		banktextField_7.setFont(new Font("Arial", Font.PLAIN, 14));
		banktextField_7.setBounds(173, 297, 440, 19);
		contentPane.add(banktextField_7);
		banktextField_7.setColumns(10);
		
		JButton submitbtnNewButton = new JButton("SUBMIT");
		submitbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DbTest.connect();
				 
				String nic =nictextField.getText();
				String surname=surnametextField_1.getText();
				String firstname=firstnametextField_2.getText();
				String middlename=middlenametextField_3.getText();
				String Address=ADDresstextField_4.getText();
				String mobile=mobiletextField_5.getText();
				String email=emailtextField_6.getText();
				String bankslipnumber=banktextField_7.getText();
				String firstverification="";
				String psecondverification="";
				String avilabledate="";
				String currentstatus=""; 
        
				
				
				DbTest.databaseinsertdataforapplicant(nic, surname, firstname, middlename, Address, mobile, email, bankslipnumber, firstverification, psecondverification, avilabledate, currentstatus);
				
				nictextField.setText("");
				surnametextField_1.setText("");
				firstnametextField_2.setText("");
				middlenametextField_3.setText("");
				ADDresstextField_4.setText("");
				mobiletextField_5.setText("");
				emailtextField_6.setText("");
				banktextField_7.setText("");
				
				
				// Clear text fields after insertion
				
				
				
			}	
			
		});
		submitbtnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		submitbtnNewButton.setBounds(274, 326, 122, 25);
		contentPane.add(submitbtnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 nictextField.setText("");
				 surnametextField_1.setText("");
				 firstnametextField_2.setText("");
				 middlenametextField_3.setText("");
				 ADDresstextField_4.setText("");
				 mobiletextField_5.setText("");
				 emailtextField_6.setText("");
				 banktextField_7.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1.setBounds(496, 451, 117, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("LOGIN PAGE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loginform createna=new Loginform ();
				createna.setVisible(true);
		        this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(41, 453, 158, 21);
		contentPane.add(btnNewButton);
		
		JButton imageNewButton_2 = new JButton("");
		imageNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageUploader createna=new ImageUploader ();
				createna.setVisible(true);
		        this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		imageNewButton_2.setBounds(207, 365, 408, 21);
		contentPane.add(imageNewButton_2);
		
		JLabel lblNewLabel_9 = new JLabel("PASSPORT SIZE IMAGE");
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_9.setBounds(0, 373, 180, 13);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("BIRTH CERTIFICATE");
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_10.setBounds(10, 413, 148, 13);
		contentPane.add(lblNewLabel_10);
		
		JButton birthbtnNewButton_2 = new JButton("");
		birthbtnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Birthcertificateuploader createna=new Birthcertificateuploader ();
				createna.setVisible(true);
			}
			
		});
		birthbtnNewButton_2.setBounds(207, 405, 406, 21);
		contentPane.add(birthbtnNewButton_2);
	}
}
