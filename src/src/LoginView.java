import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginView {

	private JFrame frame;
	
	JTextField nameField;
	JPasswordField passwordField;
	
	JButton resetButton = new JButton("Reset");
	JButton submitButton = new JButton("Submit");
	JLabel passwordLabel = new JLabel("Password");
	JLabel userLabel = new JLabel("Username");
	JButton exitButton = new JButton("Exit");
	
	
	public LoginView() {
		setFrame(new JFrame());
		getFrame().getContentPane().setEnabled(false);
		getFrame().getContentPane().setBackground(Color.LIGHT_GRAY);
		getFrame().setBounds(100, 100, 477, 430);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		userLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		userLabel.setBounds(129, 46, 72, 37);
		
		passwordLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		passwordLabel.setBounds(129, 116, 77, 28);
		
		nameField = (new JTextField());
		nameField.setBounds(129, 81, 238, 37);
		nameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(130, 145, 237, 37);
		
		resetButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		resetButton.setForeground(Color.BLACK);
		resetButton.setBackground(Color.LIGHT_GRAY);
		resetButton.setBounds(214, 192, 72, 28);
		
		submitButton.setForeground(Color.BLACK);
		submitButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		submitButton.setBackground(Color.LIGHT_GRAY);
		submitButton.setBounds(129, 192, 88, 28);
		
		exitButton.setForeground(Color.BLACK);
		exitButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		exitButton.setBackground(Color.LIGHT_GRAY);
		exitButton.setBounds(296, 192, 72, 28);
		
		getFrame().getContentPane().add(userLabel);
		getFrame().getContentPane().add(passwordLabel);
		getFrame().getContentPane().add(nameField);
		getFrame().getContentPane().add(passwordField);
		getFrame().getContentPane().add(resetButton);
		getFrame().getContentPane().add(submitButton);
		getFrame().getContentPane().add(exitButton);
		
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
			userLabel.setText(nameField.getText());
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
