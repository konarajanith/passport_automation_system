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

public class changestatus extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NICtextField;
	private JTextField currentstatustextField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					changestatus frame = new changestatus();
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
	public changestatus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NIC");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(30, 37, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CURRENT STATUS");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(30, 95, 138, 13);
		contentPane.add(lblNewLabel_1);
		
		NICtextField = new JTextField();
		NICtextField.setFont(new Font("Arial", Font.PLAIN, 14));
		NICtextField.setBounds(178, 34, 221, 19);
		contentPane.add(NICtextField);
		NICtextField.setColumns(10);
		
		currentstatustextField_1 = new JTextField();
		currentstatustextField_1.setFont(new Font("Arial", Font.PLAIN, 14));
		currentstatustextField_1.setBounds(178, 92, 221, 19);
		contentPane.add(currentstatustextField_1);
		currentstatustextField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DbTest.connect();
				 
				
				String nic=NICtextField.getText();
				String currentstatus=currentstatustextField_1.getText();
				
				DbTest.changeacurrentstatus(nic, currentstatus);
				

			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(137, 170, 107, 21);
		contentPane.add(btnNewButton);
		
		JButton PREViouspagebtnNewButton_1 = new JButton("PREVIOUS PAGE");
		PREViouspagebtnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regionalinternalwork createna=new regionalinternalwork ();
				createna.setVisible(true);
		        this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		PREViouspagebtnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		PREViouspagebtnNewButton_1.setBounds(110, 210, 193, 21);
		contentPane.add(PREViouspagebtnNewButton_1);
	}

}
