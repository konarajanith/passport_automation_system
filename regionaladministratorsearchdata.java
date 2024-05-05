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

public class regionaladministratorsearchdata extends JFrame {

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
					regionaladministratorsearchdata frame = new regionaladministratorsearchdata();
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
	public regionaladministratorsearchdata() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NIC");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(39, 53, 45, 13);
		contentPane.add(lblNewLabel);
		
		NICtextField = new JTextField();
		NICtextField.setFont(new Font("Arial", Font.PLAIN, 14));
		NICtextField.setBounds(156, 50, 224, 19);
		contentPane.add(NICtextField);
		NICtextField.setColumns(10);
		
		JButton okbtnNewButton = new JButton("OK");
		okbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DbTest.connect();
				 
				String nic=NICtextField.getText();
				DbTest.searchpassportdatabase(nic);
				
				NICtextField.setText("");
			}
		});
		okbtnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		okbtnNewButton.setBounds(151, 127, 85, 21);
		contentPane.add(okbtnNewButton);
		
		JButton PreviousbtnNewButton = new JButton("PREVIUES PAGE");
		PreviousbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regionalinternalwork createna=new regionalinternalwork ();
				createna.setVisible(true);
		        this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		PreviousbtnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		PreviousbtnNewButton.setBounds(94, 184, 224, 21);
		contentPane.add(PreviousbtnNewButton);
	}

}
