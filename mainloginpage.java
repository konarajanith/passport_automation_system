package Passautosis;

import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JScrollBar;

public class mainloginpage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainloginpage frame = new mainloginpage();
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
	public mainloginpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 462);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(153, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton userloginbtnNewButton = new JButton("USER LOGIN");
		userloginbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loginform createna=new Loginform ();
				createna.setVisible(true);
		        this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		userloginbtnNewButton.setFont(new Font("Arial", Font.BOLD, 13));
		userloginbtnNewButton.setBounds(39, 85, 536, 21);
		contentPane.add(userloginbtnNewButton);
		
		JLabel lblNewLabel = new JLabel("WELCOME PASSPORT AUTOMATION SYSTEM\r\n\t\t\t");
		lblNewLabel.setBounds(137, 36, 454, 19);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		contentPane.add(lblNewLabel);
		
		JButton RegionaladministratorbtnNewButton_1 = new JButton("REGIONAL ADMINISTRATOR LOGIN");
		RegionaladministratorbtnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regionaladministtrator createna=new regionaladministtrator ();
				createna.setVisible(true);
		        this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		RegionaladministratorbtnNewButton_1.setFont(new Font("Arial", Font.BOLD, 13));
		RegionaladministratorbtnNewButton_1.setBounds(39, 138, 536, 21);
		contentPane.add(RegionaladministratorbtnNewButton_1);
		
		JButton policebtnNewButton_2 = new JButton("POLICE LOGIN");
		policebtnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				policelogin createna=new policelogin ();
				createna.setVisible(true);
		        this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		policebtnNewButton_2.setFont(new Font("Arial", Font.BOLD, 13));
		policebtnNewButton_2.setBounds(39, 196, 536, 21);
		contentPane.add(policebtnNewButton_2);
		
		JButton instrutionbtnNewButton = new JButton("\tInstruction");
		instrutionbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String webAddress = "https://youtu.be/Wox9nr_1QL0?feature=shared";
				
				try {
                    // Open the web address in the default web browser
                    Desktop.getDesktop().browse(java.net.URI.create(webAddress));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
			}
		});
		instrutionbtnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		instrutionbtnNewButton.setBounds(430, 232, 145, 21);
		contentPane.add(instrutionbtnNewButton);
		
		JButton pdfbtnNewButton = new JButton("INSTRUTION PDF");
		pdfbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pdfFilePath = "C:\\Users\\JANITH\\Downloads\\Instructions-to-fill-Passport-application-Sinhala.pdf";
				
				try {
                    File pdfFile = new File("C:\\Users\\JANITH\\Downloads\\Instructions-to-fill-Passport-application-Sinhala.pdf");
                    if (pdfFile.exists()) {
                        Desktop.getDesktop().open(pdfFile);
                    } else {
                        System.err.println("PDF file does not exist: " +"C:\\Users\\JANITH\\Downloads\\Instructions-to-fill-Passport-application-Sinhala.pdf" );
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
			}
		});
		pdfbtnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		pdfbtnNewButton.setBounds(39, 233, 174, 21);
		contentPane.add(pdfbtnNewButton);
		
		JButton aformbtnNewButton = new JButton("APPLICANT FORM");
		aformbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pdfFilePath = "C:\\Users\\JANITH\\Downloads\\passport_application.pdf";
				
				try {
                    File pdfFile = new File("C:\\Users\\JANITH\\Downloads\\passport_application.pdf");
                    if (pdfFile.exists()) {
                        Desktop.getDesktop().open(pdfFile);
                    } else {
                        System.err.println("PDF file does not exist: " +"C:\\Users\\JANITH\\Downloads\\passport_application.pdf" );
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
				
			}
		});
		aformbtnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		aformbtnNewButton.setBounds(214, 340, 185, 21);
		contentPane.add(aformbtnNewButton);
	}
}
