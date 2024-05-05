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

public class regionalinternalwork extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regionalinternalwork frame = new regionalinternalwork();
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
	public regionalinternalwork() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FIRST VERIFICATION");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(21, 36, 186, 25);
		contentPane.add(lblNewLabel);
		
		JButton firstverificationbtnNewButton = new JButton("OK");
		firstverificationbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstverification createna=new firstverification  ();
				createna.setVisible(true);
		        this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		firstverificationbtnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		firstverificationbtnNewButton.setBounds(217, 36, 114, 21);
		contentPane.add(firstverificationbtnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("CHANGE DATE");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(21, 96, 136, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton CHANGEDATEbtnNewButton = new JButton("OK");
		CHANGEDATEbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changedate createna=new changedate  ();
				createna.setVisible(true);
		        this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		CHANGEDATEbtnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		CHANGEDATEbtnNewButton.setBounds(217, 92, 114, 21);
		contentPane.add(CHANGEDATEbtnNewButton);
		
		JLabel SearchdatalblNewLabel_2 = new JLabel("SEARCH DATA");
		SearchdatalblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		SearchdatalblNewLabel_2.setBounds(21, 148, 114, 13);
		contentPane.add(SearchdatalblNewLabel_2);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regionaladministratorsearchdata createna=new regionaladministratorsearchdata ();
				createna.setVisible(true);
		        this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(217, 145, 114, 21);
		contentPane.add(btnNewButton);
		
		JLabel changestatuslblNewLabel_2 = new JLabel("CHANGE CURRENT STATUS");
		changestatuslblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		changestatuslblNewLabel_2.setBounds(21, 193, 198, 13);
		contentPane.add(changestatuslblNewLabel_2);
		
		JButton changecurrentstatusbtnNewButton_1 = new JButton("OK");
		changecurrentstatusbtnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changestatus createna=new changestatus ();
				createna.setVisible(true);
		        this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		changecurrentstatusbtnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		changecurrentstatusbtnNewButton_1.setBounds(217, 190, 114, 21);
		contentPane.add(changecurrentstatusbtnNewButton_1);
	}
}
