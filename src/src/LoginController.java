import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class LoginController {
	private LoginView GUI;
	private DatabaseModel DB;

	public LoginController(LoginView GUI, DatabaseModel DB) {
		//--ACTION LISTENERS
		//submit login
		GUI.submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//enter name/password -> unlock/show
		
				//boolean boolExists = DB.checkUser(GUI.nameField.getText(), GUI.passwordField.getText());
				boolean boolExists = true;
				GUI.setLoginState(boolExists);
			}
		});

		//reset button
		GUI.resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI.resetPanel();
			}
		});
		
		//quit button
		GUI.exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}	

}
