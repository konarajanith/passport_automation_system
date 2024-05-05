package Passautosis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class firstverification extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NICtextField;
	private JTextField verificationtextField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstverification frame = new firstverification();
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
	public firstverification() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NIC");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(32, 46, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VERIFICATION");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(32, 117, 118, 13);
		contentPane.add(lblNewLabel_1);
		
		NICtextField = new JTextField();
		NICtextField.setFont(new Font("Arial", Font.PLAIN, 14));
		NICtextField.setBounds(160, 43, 231, 19);
		contentPane.add(NICtextField);
		NICtextField.setColumns(10);
		
		verificationtextField_1 = new JTextField();
		verificationtextField_1.setFont(new Font("Arial", Font.PLAIN, 14));
		verificationtextField_1.setBounds(160, 111, 231, 19);
		contentPane.add(verificationtextField_1);
		verificationtextField_1.setColumns(10);
		
		JButton OKbtnNewButton = new JButton("OK");
		OKbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DbTest.connect();
				
				String nic=NICtextField.getText();
				String firstverification= verificationtextField_1.getText();
				 
				DbTest.regionalfirstverification(nic, firstverification);
				
				NICtextField.setText("");
				verificationtextField_1.setText("");
			}
		});
		OKbtnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		OKbtnNewButton.setBounds(161, 187, 85, 21);
		contentPane.add(OKbtnNewButton);
		
		JButton btnNewButton = new JButton("PREVIOUS PAGE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regionalinternalwork createna=new regionalinternalwork ();
				createna.setVisible(true);
		        this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(106, 232, 203, 21);
		contentPane.add(btnNewButton);
	}
}
