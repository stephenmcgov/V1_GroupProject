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
<<<<<<< HEAD
				if (!GUI.nameField.getText().isEmpty()) {
					//boolean boolExists = DB.checkUser(GUI.nameField.getText(), GUI.passwordField.getText());
					GUI.setLoginState(true);
				}
=======
		
				//boolean boolExists = DB.checkUser(GUI.nameField.getText(), GUI.passwordField.getText());
				boolean boolExists = true;
				GUI.setLoginState(boolExists);
>>>>>>> cdba631e29ca20bdeb7ba7e866afa6ebb4bc57b6
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
				//update DB in thread
				//await response
				System.exit(0);
			}
		});
	}	

}
