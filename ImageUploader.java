package Passautosis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ImageUploader extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nicTextField;
	private JLabel lblNewLabel_1;
	private JButton backbtnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImageUploader frame = new ImageUploader();
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
	public ImageUploader() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton uploadButton = new JButton("Upload Image");
		uploadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        File selectedFile = fileChooser.getSelectedFile();
                        FileInputStream fis = new FileInputStream(selectedFile);
                        String nic = nicTextField.getText();
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
		        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO images (image, nic) VALUES (?, ?)");
		        pstmt.setBinaryStream(1, imageStream);
		        pstmt.setString(2, nic);
		        pstmt.executeUpdate();
		        pstmt.close();
		        conn.close();
				
			}
		});
		uploadButton.setFont(new Font("Arial", Font.BOLD, 14));
		uploadButton.setBounds(104, 114, 156, 21);
		contentPane.add(uploadButton);
		
		nicTextField = new JTextField();
		nicTextField.setFont(new Font("Arial", Font.BOLD, 14));
		nicTextField.setBounds(158, 55, 156, 19);
		contentPane.add(nicTextField);
		nicTextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter NIC:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(65, 56, 84, 13);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("ImageUploader");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(158, 10, 137, 21);
		contentPane.add(lblNewLabel_1);
		
		backbtnNewButton = new JButton("BACK");
		backbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passportdatabase createna=new passportdatabase ();
				createna.setVisible(true);
			}
		});
		backbtnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		backbtnNewButton.setBounds(104, 156, 156, 21);
		contentPane.add(backbtnNewButton);
	}
}

