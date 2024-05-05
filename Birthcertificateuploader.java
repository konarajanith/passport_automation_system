package Passautosis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Birthcertificateuploader extends JFrame {

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
					Birthcertificateuploader frame = new Birthcertificateuploader();
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
	public Birthcertificateuploader() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIRTH CERTIFICATE");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(128, 10, 198, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NIC");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(42, 63, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		nictextField = new JTextField();
		nictextField.setFont(new Font("Arial", Font.BOLD, 14));
		nictextField.setBounds(128, 61, 218, 19);
		contentPane.add(nictextField);
		nictextField.setColumns(10);
		
		JButton birthcerbtnNewButton = new JButton("BIRTH CERTIFICATE");
		birthcerbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        File selectedFile = fileChooser.getSelectedFile();
                        FileInputStream fis = new FileInputStream(selectedFile);
                        String nic = nictextField.getText();
                        insertImageIntoDatabase(fis, nic);
                        JOptionPane.showMessageDialog(null, "Image uploaded successfully!");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error uploading image: " + ex.getMessage());
                    }
                }
			
			}

			private void insertImageIntoDatabase(FileInputStream imageStream, String nic)throws SQLException {
				// TODO Auto-generated method stub
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/passportautomationsystem", "root", "Conara123#");
		        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO birthcertificate (image, nic) VALUES (?, ?)");
		        pstmt.setBinaryStream(1, imageStream);
		        pstmt.setString(2, nic);
		        pstmt.executeUpdate();
		        pstmt.close();
		        conn.close();
				
			}
		});
		birthcerbtnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		birthcerbtnNewButton.setBounds(116, 131, 180, 21);
		contentPane.add(birthcerbtnNewButton);
		
		JButton backbtnNewButton = new JButton("BACK");
		backbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passportdatabase createna=new passportdatabase ();
				createna.setVisible(true);
			}
			
		});
		backbtnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		backbtnNewButton.setBounds(159, 166, 85, 21);
		contentPane.add(backbtnNewButton);
	}

}
