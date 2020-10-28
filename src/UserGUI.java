import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class UserGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstname;
	private JTextField txtLastname;
	private JTextField txtAddress;
	private JTextField txtGender;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserGUI frame = new UserGUI();
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
	public UserGUI() {
		setTitle("User registeration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please fill the form below to be registerd in Best Property's system.");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(53, 11, 505, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First name:");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(41, 70, 90, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last name:");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(41, 117, 90, 16);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Address:");
		lblNewLabel_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(41, 163, 90, 16);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Gender:");
		lblNewLabel_1_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(41, 220, 90, 16);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Email:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBounds(41, 270, 90, 16);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		txtFirstname = new JTextField();
		txtFirstname.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtFirstname.setBounds(144, 66, 295, 26);
		contentPane.add(txtFirstname);
		txtFirstname.setColumns(10);
		
		txtLastname = new JTextField();
		txtLastname.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtLastname.setColumns(10);
		txtLastname.setBounds(144, 113, 295, 26);
		contentPane.add(txtLastname);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtAddress.setColumns(10);
		txtAddress.setBounds(144, 159, 295, 26);
		contentPane.add(txtAddress);
		
		txtGender = new JTextField();
		txtGender.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtGender.setColumns(10);
		txtGender.setBounds(144, 216, 295, 26);
		contentPane.add(txtGender);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtEmail.setColumns(10);
		txtEmail.setBounds(144, 266, 295, 26);
		contentPane.add(txtEmail);
		
		
		JCheckBox chckbxTerms = new JCheckBox("I agree to terms and conditions of Best Property. ");
		chckbxTerms.setBounds(41, 339, 340, 23);
		contentPane.add(chckbxTerms);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxTerms.isSelected()) {
					String msg;
					msg = "User has been created. Please check your email for verification link and verify your email address" + "\n";
					System.out.println(msg);
				} else {
					String msgError;
					msgError="Please agree to terms and conditions.";
					System.out.println(msgError);
				  }
			}
		});
		btnSubmit.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnSubmit.setBounds(68, 411, 133, 55);
		contentPane.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg;
				msg="User has not been created! Hope to see you back!";
				System.out.println(msg);
				dispose();
	
			}
		});
		btnCancel.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnCancel.setBounds(358, 411, 133, 55);
		contentPane.add(btnCancel);
		
		JButton btnClearFrom = new JButton("Clear Form");
		btnClearFrom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirstname.setText("");
				txtLastname.setText("");
				txtAddress.setText("");
				txtGender.setText("");
				txtEmail.setText("");
			}
		});
		btnClearFrom.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnClearFrom.setBounds(213, 411, 133, 55);
		contentPane.add(btnClearFrom);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(6, 39, 582, 19);
		contentPane.add(separator);
		
		
		
		JButton btnTerms = new JButton("Click for terms and conditions");
		btnTerms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TermsAndCon t=new TermsAndCon();
				t.setVisible(true);
			}
		});
		btnTerms.setBounds(376, 338, 226, 29);
		contentPane.add(btnTerms);
	}
}
