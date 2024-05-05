package Passautosis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class regionaladministtrator extends JFrame {

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
					regionaladministtrator frame = new regionaladministtrator();
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
	public regionaladministtrator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(47, 54, 118, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("ADMINISTRATER LOGIN");
		lblNewLabel.setBounds(141, 10, 187, 17);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2.setBounds(47, 103, 85, 13);
		contentPane.add(lblNewLabel_2);
		
		usernametextField = new JTextField();
		usernametextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		usernametextField.setBounds(175, 52, 220, 19);
		contentPane.add(usernametextField);
		usernametextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField.setBounds(175, 101, 220, 19);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernametextField.getText();
		        String password = passwordField.getText();
		        
		        // Dummy check for username and password
		        if (username.equals("jk") && password.equals("jk")) {
		            JOptionPane.showMessageDialog(null, "Login Successful!");
		            // You can perform further actions here after successful login
		           
		            regionalinternalwork createna=new regionalinternalwork ();
					createna.setVisible(true);
			        this.setVisible(false);
		            
		            
		        } else {
		            JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
		        }
		        usernametextField.setText("");
		        passwordField.setText(""); 
			}
			

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(168, 181, 85, 21);
		contentPane.add(btnNewButton);
	}
}
