import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class frmInvoice extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrice1;
	private JTextField txtSum1;
	private JTextField txtPrice2;
	private JTextField txtSum2;
	private JTextField txtPrice3;
	private JTextField txtSum3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmInvoice frame = new frmInvoice();
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
	public frmInvoice() {
		setTitle("Invoice From");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Simple Invoice Demo");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, ١٨));
		lblTitle.setBounds(135, 0, 188, 36);
		contentPane.add(lblTitle);
		
		JLabel lbltem1 = new JLabel("Item1");
		lbltem1.setFont(new Font("Tahoma", Font.PLAIN, ١٤));
		lbltem1.setBounds(58, 90, 46, 14);
		contentPane.add(lbltem1);
		
		JLabel lblItems = new JLabel("Items");
		lblItems.setFont(new Font("Tahoma", Font.BOLD, ١٤));
		lblItems.setBounds(48, 43, 58, 36);
		contentPane.add(lblItems);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(48, 75, 376, 1);
		contentPane.add(separator);
		
		JLabel lblQTy = new JLabel("QTY");
		lblQTy.setFont(new Font("Tahoma", Font.BOLD, ١٤));
		lblQTy.setBounds(145, 42, 58, 36);
		contentPane.add(lblQTy);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, ١٤));
		lblPrice.setBounds(252, 42, 58, 36);
		contentPane.add(lblPrice);
		
		JLabel lblSum = new JLabel("Sum");
		lblSum.setFont(new Font("Tahoma", Font.BOLD, ١٤));
		lblSum.setBounds(377, 42, 58, 36);
		contentPane.add(lblSum);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(47, 45, 376, 1);
		contentPane.add(separator_1);
		
		JSpinner spnQty1 = new JSpinner();
		spnQty1.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spnQty1.setFont(new Font("Tahoma", Font.BOLD, ١١));
		spnQty1.setBounds(146, 89, 40, 20);
		contentPane.add(spnQty1);
		
		txtPrice1 = new JTextField();
		txtPrice1.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrice1.setFont(new Font("Tahoma", Font.BOLD, ١١));
		txtPrice1.setText("0.0");
		txtPrice1.setBounds(252, 89, 58, 20);
		contentPane.add(txtPrice1);
		txtPrice1.setColumns(10);
		
		txtSum1 = new JTextField();
		txtSum1.setText("0.0");
		txtSum1.setHorizontalAlignment(SwingConstants.CENTER);
		txtSum1.setFont(new Font("Tahoma", Font.BOLD, ١١));
		txtSum1.setColumns(10);
		txtSum1.setBounds(365, 89, 58, 20);
		contentPane.add(txtSum1);
		
		JLabel lblItem2 = new JLabel("Item2");
		lblItem2.setFont(new Font("Tahoma", Font.PLAIN, ١٤));
		lblItem2.setBounds(58, 121, 46, 14);
		contentPane.add(lblItem2);
		
		JSpinner spnQty2 = new JSpinner();
		spnQty2.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spnQty2.setFont(new Font("Tahoma", Font.BOLD, ١١));
		spnQty2.setBounds(146, 120, 40, 20);
		contentPane.add(spnQty2);
		
		txtPrice2 = new JTextField();
		txtPrice2.setText("0.0");
		txtPrice2.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrice2.setFont(new Font("Tahoma", Font.BOLD, ١١));
		txtPrice2.setColumns(10);
		txtPrice2.setBounds(252, 120, 58, 20);
		contentPane.add(txtPrice2);
		
		txtSum2 = new JTextField();
		txtSum2.setText("0.0");
		txtSum2.setHorizontalAlignment(SwingConstants.CENTER);
		txtSum2.setFont(new Font("Tahoma", Font.BOLD, ١١));
		txtSum2.setColumns(10);
		txtSum2.setBounds(365, 120, 58, 20);
		contentPane.add(txtSum2);
		
		JLabel lblItem3 = new JLabel("Item3");
		lblItem3.setFont(new Font("Tahoma", Font.PLAIN, ١٤));
		lblItem3.setBounds(59, 152, 46, 14);
		contentPane.add(lblItem3);
		
		JSpinner spnQty3 = new JSpinner();
		spnQty3.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spnQty3.setFont(new Font("Tahoma", Font.BOLD, ١١));
		spnQty3.setBounds(147, 151, 40, 20);
		contentPane.add(spnQty3);
		
		txtPrice3 = new JTextField();
		txtPrice3.setText("0.0");
		txtPrice3.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrice3.setFont(new Font("Tahoma", Font.BOLD, ١١));
		txtPrice3.setColumns(10);
		txtPrice3.setBounds(253, 151, 58, 20);
		contentPane.add(txtPrice3);
		
		txtSum3 = new JTextField();
		txtSum3.setText("0.0");
		txtSum3.setHorizontalAlignment(SwingConstants.CENTER);
		txtSum3.setFont(new Font("Tahoma", Font.BOLD, ١١));
		txtSum3.setColumns(10);
		txtSum3.setBounds(366, 151, 58, 20);
		contentPane.add(txtSum3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(48, 182, 376, 1);
		contentPane.add(separator_2);
		
		JLabel lblTot = new JLabel("Total:");
		lblTot.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTot.setFont(new Font("Times New Roman", Font.BOLD, ١٥));
		lblTot.setBounds(308, 208, 46, 14);
		contentPane.add(lblTot);
		
		JLabel lblTotal = new JLabel("0.0");
		lblTotal.setForeground(new Color(0, 0, 255));
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, ١٤));
		lblTotal.setBounds(366, 208, 58, 14);
		contentPane.add(lblTotal);
		
		JButton btnTotal = new JButton("Calculation");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //Integer.parseInt()
				int qty1 =(Integer) spnQty1.getValue();
				double price1 = Double.parseDouble(txtPrice1.getText());
				double sum1 = qty1 * price1;
				String getSum1 = Double.toString(sum1);
				txtSum1.setText(getSum1);
				
				int qty2 =(Integer) spnQty2.getValue();
				double price2 = Double.parseDouble(txtPrice2.getText());
				double sum2 = qty2 * price2;
				String getSum2 = Double.toString(sum2);
				txtSum2.setText(getSum2);
				
				int qty3 =(Integer) spnQty3.getValue();
				double price3 = Double.parseDouble(txtPrice3.getText());
				double sum3 = qty3 * price3;
				String getSum3 = Double.toString(sum3);
				txtSum3.setText(getSum3);
				
				String total = Double.toString(sum1 + sum2 + sum3);
				lblTotal.setText(total);
				
			}
		});
		btnTotal.setFont(new Font("Times New Roman", Font.PLAIN, ١٤));
		btnTotal.setBounds(308, 245, 109, 23);
		contentPane.add(btnTotal);
	}
}
