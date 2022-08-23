import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.beans.PropertyChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.metal.MetalToggleButtonUI;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginGUIView {

	//declare panel elements
	private JFrame frame;
	JTextField nameField = new JTextField();;
	JLabel nameLabel = new JLabel("Enter Name");
	JTextField passwordField = new JTextField();;
	JLabel passwordLabel = new JLabel("Enter Password");
	JLabel errorLabel = new JLabel("Login Format Error!");
	JButton submitButton = new JButton("Submit");
	JButton resetButton = new JButton("RESET");
	JButton quitButton = new JButton("QUIT");
	JLabel lblNewLabel = new JLabel("");

	public LoginGUIView() throws IOException {
		//--setup frame
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 500, 500);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(new GridLayout(0, 3, 0, 0));
		
		submitButton.setVisible(false);
		resetButton.setVisible(false);
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameField.setColumns(10);
		errorLabel.setForeground(Color.RED);
		errorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		errorLabel.setVisible(true);
		passwordField.setColumns(10);
		quitButton.setVisible(false);
		
		getFrame().getContentPane().add(nameLabel);
		getFrame().getContentPane().add(lblNewLabel);
		getFrame().getContentPane().add(passwordLabel);
		getFrame().getContentPane().add(nameField);
		getFrame().getContentPane().add(errorLabel);
		getFrame().getContentPane().add(passwordField);
		getFrame().getContentPane().add(resetButton);
		getFrame().getContentPane().add(submitButton);
		getFrame().getContentPane().add(quitButton);
	}
	
	public void setLoginState(Boolean boolExists) {
		boolean exists = boolExists;
				
		if(exists) {
			//show hidden elements
			resetButton.setVisible(true);
			quitButton.setVisible(true);
					
			//hide login elements
			nameField.setVisible(false);
			passwordField.setVisible(false);
			submitButton.setVisible(false);
					
			//set name/password
			nameLabel.setText(nameField.getText());
			//passwordLabel.setText("");
			errorLabel.setVisible(false);
		}
		else {
			//set all vals / visibilities to default/login
			errorLabel.setText("Wrong Username or Password!");
			errorLabel.setVisible(true);
		}
	}

	public String getNameField() {
		String name = nameField.getText();
		return name;
	}
	
	public void setNameField(String name) {
		nameLabel.setText(nameField.getText());
	}
	
	//sets error text if(empty)
	public void checkNameEmpty() {
		//isEmpty ignores 1st char, =="" ignores after 1st press
		if(nameField.getText().isEmpty()) {
			errorLabel.setVisible(true);
			submitButton.setVisible(false);
		}
		else {
			errorLabel.setVisible(false);
			submitButton.setVisible(true);
		}
	}
	
	public void resetPanel() {
		//set all vals / visibilities to default/login
		nameLabel.setText("Enter Name");
		passwordLabel.setText("Enter Password");
		nameField.setText("");
		passwordField.setText("");
		errorLabel.setVisible(true);
		submitButton.setVisible(false);
		
		//hide clicker elements
		resetButton.setVisible(false);
		quitButton.setVisible(false);
		
		//show login elements
		nameField.setVisible(true);
		passwordField.setVisible(true);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
