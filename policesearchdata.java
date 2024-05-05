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

public class policesearchdata extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nictextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					policesearchdata frame = new policesearchdata();
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
	public policesearchdata() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NIC");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(36, 64, 59, 13);
		contentPane.add(lblNewLabel);
		
		nictextField = new JTextField();
		nictextField.setFont(new Font("Arial", Font.BOLD, 14));
		nictextField.setBounds(156, 61, 222, 19);
		contentPane.add(nictextField);
		nictextField.setColumns(10);
		
		JButton searchbtnNewButton = new JButton("SEARCH");
		searchbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DbTest.connect();
				 
				String nic=nictextField.getText();
				DbTest.searchpassportdatabase(nic);
				
				nictextField.setText("");
			}
		});
		searchbtnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		searchbtnNewButton.setBounds(143, 139, 118, 21);
		contentPane.add(searchbtnNewButton);
		
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
		previouspagebtnNewButton_1.setBounds(143, 175, 195, 21);
		contentPane.add(previouspagebtnNewButton_1);
	}

}
