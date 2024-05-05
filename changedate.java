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

public class changedate extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nictextField;
	private JTextField datetextField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					changedate frame = new changedate();
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
	public changedate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NIC");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(25, 34, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Avilable date");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(25, 96, 120, 13);
		contentPane.add(lblNewLabel_1);
		
		nictextField = new JTextField();
		nictextField.setFont(new Font("Arial", Font.PLAIN, 14));
		nictextField.setBounds(155, 31, 253, 19);
		contentPane.add(nictextField);
		nictextField.setColumns(10);
		
		datetextField_1 = new JTextField();
		datetextField_1.setFont(new Font("Arial", Font.PLAIN, 14));
		datetextField_1.setBounds(155, 93, 253, 19);
		contentPane.add(datetextField_1);
		datetextField_1.setColumns(10);
		
		JButton OKbtnNewButton = new JButton("OK");
		OKbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DbTest.connect();
				 
				
				String nic=nictextField.getText();
				String avilabledate=datetextField_1.getText();
				
				DbTest.changeavilabledate(nic, avilabledate);
				
				nictextField.setText("");
				datetextField_1.setText("");
			}
		});
		OKbtnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		OKbtnNewButton.setBounds(155, 167, 85, 21);
		contentPane.add(OKbtnNewButton);
		
		JButton previousbuttonbtnNewButton = new JButton("PREVIOUS PAGE");
		previousbuttonbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regionalinternalwork createna=new regionalinternalwork ();
				createna.setVisible(true);
		        this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		previousbuttonbtnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		previousbuttonbtnNewButton.setBounds(113, 219, 208, 21);
		contentPane.add(previousbuttonbtnNewButton);
	}

}
