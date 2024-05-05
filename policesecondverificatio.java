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

public class policesecondverificatio extends JFrame {

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
					policesecondverificatio frame = new policesecondverificatio();
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
	public policesecondverificatio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel niclblNewLabel_1 = new JLabel("NIC");
		niclblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		niclblNewLabel_1.setBounds(10, 47, 45, 13);
		contentPane.add(niclblNewLabel_1);
		
		JLabel verificationlblNewLabel_2 = new JLabel("VERIFICATION");
		verificationlblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		verificationlblNewLabel_2.setBounds(10, 99, 110, 13);
		contentPane.add(verificationlblNewLabel_2);
		
		NICtextField = new JTextField();
		NICtextField.setFont(new Font("Arial", Font.PLAIN, 14));
		NICtextField.setBounds(157, 44, 228, 19);
		contentPane.add(NICtextField);
		NICtextField.setColumns(10);
		
		verificationtextField_1 = new JTextField();
		verificationtextField_1.setFont(new Font("Arial", Font.PLAIN, 14));
		verificationtextField_1.setBounds(157, 96, 228, 19);
		contentPane.add(verificationtextField_1);
		verificationtextField_1.setColumns(10);
		
		JButton okbtnNewButton = new JButton("OK");
		okbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DbTest.connect();
				 
				
				String nic=NICtextField.getText();
				String psecondverification=verificationtextField_1.getText();
				
				DbTest.psecondverification(nic, psecondverification);
				 
				NICtextField.setText("");
				verificationtextField_1.setText("");	
			}
		});
		okbtnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		okbtnNewButton.setBounds(139, 157, 85, 21);
		contentPane.add(okbtnNewButton);
		
		JButton previouspagebtnNewButton_1 = new JButton("PREVIOUS PAGE");
		previouspagebtnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				policeinternal createna=new policeinternal ();
				createna.setVisible(true);
		        this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		previouspagebtnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		previouspagebtnNewButton_1.setBounds(81, 214, 228, 21);
		contentPane.add(previouspagebtnNewButton_1);
	}

}
