import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JSeparator;

public class frmMain extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMain frame = new frmMain();
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
	public frmMain() {
		setTitle("Main Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 244);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Login System");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, ١٨));
		lblTitle.setBounds(119, 27, 127, 29);
		contentPane.add(lblTitle);
		
		JLabel lblUser = new JLabel("User Name:");
		lblUser.setFont(new Font("Times New Roman", Font.PLAIN, ١٤));
		lblUser.setBounds(10, 74, 72, 29);
		contentPane.add(lblUser);
		
		JLabel lblPass = new JLabel("Password:");
		lblPass.setFont(new Font("Times New Roman", Font.PLAIN, ١٤));
		lblPass.setBounds(10, 114, 72, 29);
		contentPane.add(lblPass);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Times New Roman", Font.PLAIN, ١٤));
		txtUser.setBounds(102, 78, 178, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtPass = new JTextField();
		txtPass.setFont(new Font("Times New Roman", Font.PLAIN, ١٤));
		txtPass.setColumns(10);
		txtPass.setBounds(102, 118, 178, 20);
		contentPane.add(txtPass);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user = txtUser.getText();
				String pass = txtPass.getText();
				
				if (user.contentEquals("user") && pass.contentEquals("123")) {
					JOptionPane.showMessageDialog(null,"Access Logined Successfully", "Login System", JOptionPane.INFORMATION_MESSAGE);
					ClearFildes();
					 
					frmInvoice invoice = new frmInvoice();
					
					invoice.main(null);;
				} else {
					JOptionPane.showMessageDialog(null,"Access denied", "Login System", JOptionPane.ERROR_MESSAGE);
					ClearFildes();
				}
				
				
				
			}
		});
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, ١٤));
		btnLogin.setBounds(102, 163, 89, 23);
		contentPane.add(btnLogin);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(102, 149, 180, 2);
		contentPane.add(separator);
		
		JButton btnRest = new JButton("Reset");
		btnRest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClearFildes();
				
			}

		});
		btnRest.setFont(new Font("Times New Roman", Font.PLAIN, ١٤));
		btnRest.setBounds(191, 163, 89, 23);
		contentPane.add(btnRest);
	}
	

	public void ClearFildes() {
		txtUser.setText(null);
		txtPass.setText(null);
	}
}
