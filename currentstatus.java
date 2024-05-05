package Passautosis;

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
import java.awt.event.ActionEvent;

public class currentstatus extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NICtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currentstatus frame = new currentstatus();
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
	public currentstatus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CURRENT STATUS");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(167, 10, 155, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NIC");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(27, 85, 52, 13);
		contentPane.add(lblNewLabel_1);
		
		NICtextField = new JTextField();
		NICtextField.setFont(new Font("Arial", Font.PLAIN, 14));
		NICtextField.setBounds(117, 83, 190, 19);
		contentPane.add(NICtextField);
		NICtextField.setColumns(10);
		
		JButton btnNewButton = new JButton("SHOW CURRENT STATUS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DbTest.connect();
				String nic = NICtextField.getText();
				
		        // You can perform further actions here after successful login
				DbTest.Applicantsearch(nic);  
				
				NICtextField.setText("");
			}
			
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(106, 165, 221, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("login page");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loginform createna=new Loginform ();
				createna.setVisible(true);
		        this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1.setBounds(160, 211, 117, 21);
		contentPane.add(btnNewButton_1);
	}
}
