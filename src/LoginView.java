
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class LoginView {

	private JFrame frame;
	
	JTextField nameField;
	JPasswordField passwordField;
	ImageIcon icon;
	Image scaledImage;
	
	JButton resetButton = new JButton("Reset");
	JButton submitButton = new JButton("Submit");
	JLabel passwordLabel = new JLabel("Password");
	JLabel userLabel = new JLabel("Username");
	JButton exitButton = new JButton("Exit");
	JButton viewCartButton = new JButton("View Cart");
	
	
	private final JLabel lblNewLabel = new JLabel("hoodie");
	private final JLabel imageLable1 = new JLabel("IMg1");
	private final JLabel priceTwo = new JLabel("13$");
	private final JLabel stock1 = new JLabel("In Stock ");
	private final JLabel lblNewLabel_4 = new JLabel("hoodie");
	private final JLabel imageLable2 = new JLabel("IMAGE2");
	private final JLabel stock2 = new JLabel("In Stock ");
	private final JLabel lblNewLabel_4_1 = new JLabel("hoodie");
	private JLabel imageLable3 = new JLabel("Image3");
	private final JLabel stock3 = new JLabel("only few left");
	private final JLabel priceThree = new JLabel("14$");
	private final JLabel priceOne = new JLabel("12$");
	private final JButton btnNewButton = new JButton("Add to cart ");
	private final JButton btnNewButton_1 = new JButton("Add to cart ");
	private final JButton btnNewButton_2 = new JButton("Add to cart ");
	private final JLabel Discri_One = new JLabel("Confortable");
	private final JLabel Discri_two = new JLabel("winter Wear");
	private final JLabel Discri_three = new JLabel("Confortable");
	private final JPanel panel = new JPanel();
	private final JLabel cartLable = new JLabel("CART");
	private final JLabel lblTotal = new JLabel("Total :");
	private final JLabel priceTotal = new JLabel("----");
	private final JButton checkoutButton = new JButton("CheckOut");
	
	
	
    
	
	public LoginView() {
		setFrame(new JFrame());
		getFrame().getContentPane().setEnabled(false);
		getFrame().getContentPane().setBackground(Color.LIGHT_GRAY);
		getFrame().setBounds(100, 100, 783, 592);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		userLabel.setBounds(10, 10, 72, 37);
		
		userLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordLabel.setBounds(268, 14, 77, 28);
		
		passwordLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		
		nameField = (new JTextField());
		nameField.setBounds(85, 12, 179, 37);
		nameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(335, 12, 237, 37);
		resetButton.setBounds(680, 14, 72, 28);
		
		resetButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		resetButton.setForeground(Color.BLACK);
		resetButton.setBackground(Color.LIGHT_GRAY);
		submitButton.setBounds(582, 14, 88, 28);
		
		submitButton.setForeground(Color.BLACK);
		submitButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		submitButton.setBackground(Color.LIGHT_GRAY);
		exitButton.setBounds(642, 52, 72, 28);
		
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		exitButton.setForeground(Color.BLACK);
		exitButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		exitButton.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		getFrame().getContentPane().add(userLabel);
		getFrame().getContentPane().add(passwordLabel);
		getFrame().getContentPane().add(nameField);
		getFrame().getContentPane().add(passwordField);
		getFrame().getContentPane().add(resetButton);
		getFrame().getContentPane().add(submitButton);
		getFrame().getContentPane().add(exitButton);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(26, 70, 88, 25);
		
		frame.getContentPane().add(lblNewLabel);
		imageLable1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		imageLable1.setBounds(21, 90, 132, 109);
		
		frame.getContentPane().add(imageLable1);
		priceTwo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		priceTwo.setBounds(350, 221, 42, 25);
		
		frame.getContentPane().add(priceTwo);
		stock1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		stock1.setBounds(26, 221, 72, 25);
		
		frame.getContentPane().add(stock1);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(257, 70, 88, 25);
		
		frame.getContentPane().add(lblNewLabel_4);
		imageLable2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		imageLable2.setBounds(257, 90, 132, 99);
		icon = new ImageIcon("src/JK-217.PNG");
	    scaledImage = icon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
	    imageLable3.setIcon(new ImageIcon(scaledImage));
		
		frame.getContentPane().add(imageLable2);
		stock2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		stock2.setBounds(254, 221, 72, 25);
		
		frame.getContentPane().add(stock2);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4_1.setBounds(470, 70, 88, 25);
		
		frame.getContentPane().add(lblNewLabel_4_1);
		imageLable3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		imageLable3.setBounds(470, 90, 132, 99);
		
		frame.getContentPane().add(imageLable3);
		stock3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		stock3.setBounds(456, 221, 132, 25);
		
		frame.getContentPane().add(stock3);
		priceThree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		priceThree.setBounds(574, 221, 42, 25);
		
		frame.getContentPane().add(priceThree);
		priceOne.setFont(new Font("Tahoma", Font.PLAIN, 16));
		priceOne.setBounds(111, 221, 42, 25);
		
		frame.getContentPane().add(priceOne);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(26, 265, 126, 21);
		
		frame.getContentPane().add(btnNewButton);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(238, 267, 126, 21);
		
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(456, 267, 126, 21);
		
		frame.getContentPane().add(btnNewButton_2);
		Discri_One.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Discri_One.setBounds(26, 196, 127, 28);
		
		frame.getContentPane().add(Discri_One);
		Discri_two.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Discri_two.setBounds(257, 196, 127, 28);
		
		frame.getContentPane().add(Discri_two);
		Discri_three.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Discri_three.setBounds(456, 196, 127, 28);
		
		frame.getContentPane().add(Discri_three);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 296, 284, 37);
		
		frame.getContentPane().add(panel);
		panel.add(cartLable);
		cartLable.setForeground(Color.WHITE);
		cartLable.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotal.setBounds(220, 354, 74, 28);
		
		frame.getContentPane().add(lblTotal);
		priceTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		priceTotal.setBounds(291, 354, 74, 28);
		
		frame.getContentPane().add(priceTotal);
		checkoutButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		checkoutButton.setBounds(470, 352, 129, 37);
		
		frame.getContentPane().add(checkoutButton);
		
		viewCartButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		viewCartButton.setBounds(43, 350, 129, 37);
		
		frame.getContentPane().add(viewCartButton);
		
	}
	public JFrame getFrame() {
		return frame;
	}
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	public String getNameField() {
		String name = nameField.getText();
		return name;
	}
	public void setNameField(String name) {
		userLabel.setText(nameField.getText());
	}
	
	public void setLoginState(Boolean boolExists) {
		boolean exists = boolExists;

		if (exists) {
			// hide login elements
			nameField.setVisible(false);
			passwordField.setVisible(false);
			submitButton.setVisible(false);
			passwordLabel.setVisible(false);
			
			// set name
			userLabel.setText("Hello "+nameField.getText());
		} else {
			// show error dialog
			JOptionPane.showMessageDialog(submitButton,"Wrong password or username");
		}
	}
	
	public void resetPanel() {
		// set all vals / visibilities to default/login
		userLabel.setText("Enter Name");
		passwordLabel.setText("Enter Password");
		nameField.setText("");
		passwordField.setText("");
		
		// show login elements
		nameField.setVisible(true);
		passwordField.setVisible(true);
		submitButton.setVisible(true);
		passwordLabel.setVisible(true);
	}
}
