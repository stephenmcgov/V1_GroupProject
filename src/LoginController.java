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
				if (!GUI.nameField.getText().isEmpty()) {
					boolean boolExists = DB.checkPlayer(GUI.nameField.getText(), GUI.passwordField.getText());
					GUI.setLoginState(boolExists);
				}
			}
		});
				
		GUI.nameField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				GUI.checkNameEmpty();
			}
		});
		
		//reset button
		GUI.resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI.resetPanel();
			}
		});
		
		//quit button
		GUI.quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//update DB in thread
				//await response
				System.exit(0);
			}
		});
	}	

}
